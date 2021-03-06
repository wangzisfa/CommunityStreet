create table activity
(
    activity_id                int          not null comment '活动id',
    activity_name              varchar(25)  not null comment '活动名称',
    activity_address           varchar(20)  null comment '活动地址',
    activity_participation_MAX int          null comment '活动最多参与人数',
    activity_participation     int          null comment '活动参与人数',
    `activity_
Registration_Start_Time`   datetime     null comment '活动报名开始时间',
    `activity_
Registration_Deadline`     datetime     null comment '活动报名截至时间',
    `activity_
Start_Time`                datetime     null comment '活动开始时间',
    activity_Deadline          datetime     null comment '活动截止时间',
    activity_credits           int          null comment '活动学分',
    activity_content           varchar(255) null comment '活动内容',
    activity_picture           blob         null,
    primary key (activity_name, activity_id)
);

create index activity_id
    on activity (activity_id);

create table community
(
    community_id               int auto_increment comment '社团id',
    community_name             varchar(20)                         not null comment '社团姓名',
    community_administrator_id int                                 null comment '社团管理员',
    community_activity_id      int                                 null comment '社团活动',
    community_member_id        int                                 null comment '社团成员',
    community_creat_time       timestamp default CURRENT_TIMESTAMP null comment '社团创建时间',
    primary key (community_name, community_id)
);

create index community_id
    on community (community_id);

create index fk_c_u
    on community (community_member_id);

create index fk_c_u_A
    on community (community_administrator_id);

create index fk_user_c
    on community (community_activity_id);

create index user_name
    on community (community_name);

create index user_number
    on community (community_name, community_administrator_id);

create index user_number_2
    on community (community_name, community_administrator_id);

create index user_number_3
    on community (community_name);

create table information
(
    user_id      int null,
    community_id int null,
    activity_id  int null
);

create index fk_a_id
    on information (activity_id);

create index fk_c_id
    on information (community_id);

create index fk_u_id
    on information (user_id);

create table user
(
    user_id               int auto_increment comment '用户id',
    user_password         varchar(20)                         not null comment '用户密码',
    user_number           int                                 not null comment '用户学号',
    user_name             varchar(20)                         null comment '用户姓名',
    user_college          varchar(20)                         null comment '用户学院',
    user_email            varchar(20)                         not null comment '用户邮箱',
    user_phone            int                                 null comment '用户手机号',
    user_community_id     int                                 null comment '用户参加的社团',
    user_join_activity_id int                                 null comment '用户参加的活动',
    user_credits          float                               null comment '用户学分',
    user_nickname         varchar(20)                         null comment '用户昵称',
    user_sex              varchar(20)                         null comment '用户性别',
    user_nationailty      varchar(20)                         null comment '用户民族',
    user_creat_time       timestamp default CURRENT_TIMESTAMP null comment '用户创建时间',
    user_signature        varchar(50)                         null,
    primary key (user_id, user_number)
);

create index fk_u_a
    on user (user_join_activity_id);

create index fk_u_c
    on user (user_community_id);

create index user_id
    on user (user_id);

create index user_name
    on user (user_name);

create index user_number
    on user (user_number, user_name, user_college, user_email);

create index user_number_2
    on user (user_number, user_name, user_college);

create index user_number_3
    on user (user_number, user_name);


