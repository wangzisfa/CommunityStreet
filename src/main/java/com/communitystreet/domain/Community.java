package com.communitystreet.domain;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;
import java.util.Date;

@ApiModel
public class Community {
    @ApiModelProperty(value = "id", dataType = "int64", example = "10")
    private int id;
    @ApiModelProperty(value = "社团名称", dataType = "String", example = "计算机协会")
    private String name;
    @ApiModelProperty(value = "社团管理员关联", dataType = "int64", example = "10")
    private int COMMUNITY_ADMINISTRATOR_ID;
    @ApiModelProperty(value = "社团活动关联", dataType = "int64", example = "10")
    private int COMMUNITY_ACTIVITY_ID;
    @ApiModelProperty(value = "社团成员关联", dataType = "int64", example = "10")
    private int COMMUNITY_MEMBER_ID;
    @ApiModelProperty(value = "社团创建时间", dataType = "Timestamp", example = "1614688622")
    private Timestamp CREATE_TIME_SQL;
    @ApiModelProperty(value = "社团创建时间", dataType = "Date" , example = "2021.3.2")
    private Date CREATE_TIME;
    @ApiModelProperty(value = "社团描述", dataType = "String", example = "描述")
    private String describe;
    @ApiModelProperty(value = "社团类型", dataType = "String", example = "校级")
    private String type;

    public Community() {
    }





    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Timestamp getCREATE_TIME_SQL() {
        return CREATE_TIME_SQL;
    }

    public void setCREATE_TIME_SQL(Timestamp CREATE_TIME_SQL) {
        this.CREATE_TIME_SQL = CREATE_TIME_SQL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCOMMUNITY_ADMINISTRATOR_ID() {
        return COMMUNITY_ADMINISTRATOR_ID;
    }

    public void setCOMMUNITY_ADMINISTRATOR_ID(int COMMUNITY_ADMINISTRATOR_ID) {
        this.COMMUNITY_ADMINISTRATOR_ID = COMMUNITY_ADMINISTRATOR_ID;
    }

    public int getCOMMUNITY_ACTIVITY_ID() {
        return COMMUNITY_ACTIVITY_ID;
    }

    public void setCOMMUNITY_ACTIVITY_ID(int COMMUNITY_ACTIVITY_ID) {
        this.COMMUNITY_ACTIVITY_ID = COMMUNITY_ACTIVITY_ID;
    }

    public int getCOMMUNITY_MEMBER_ID() {
        return COMMUNITY_MEMBER_ID;
    }

    public void setCOMMUNITY_MEMBER_ID(int COMMUNITY_MEMBER_ID) {
        this.COMMUNITY_MEMBER_ID = COMMUNITY_MEMBER_ID;
    }

    public Date getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(Date CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

}
