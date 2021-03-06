package com.communitystreet.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;
import java.util.Date;

@ApiModel
public class Activity {
    @ApiModelProperty(value = "id", dataType = "int64", example = "10")
    private int id;
    @ApiModelProperty(value = "活动名称", dataType = "String", example = "环西科自行车赛")
    private String name;
    @ApiModelProperty(value = "活动地址", dataType = "String", example = "9教101教室")
    private String address;
    @ApiModelProperty(value = "活动最大参与人数", dataType = "int64", example = "10")
    private int PARTICIPATION_MAXVALUE;
    @ApiModelProperty(value = "当前活动人数", dataType = "int64", example = "10")
    private int PARTICIPATION_COUNT;
    @ApiModelProperty(value = "活动开始加入时间", dataType = "Date", example = "2021.3.2")
    private Date REGISTRATION_START_TIME;
    @ApiModelProperty(value = "活动结束加入时间", dataType = "Date", example = "2021.3.2")
    private Date REGISTRATION_DEADLINE;
    @ApiModelProperty(value = "活动创建时间", dataType = "Timestamp", example = "1614688622")
    private Timestamp ACTIVITY_START_TIME;
    @ApiModelProperty(value = "活动结束时间", dataType = "Date", example = "2021.3.2")
    private Date ACTIVITY_DEADLINE;
    @ApiModelProperty(value = "活动积分", dataType = "double", example = "10.12")
    private double credit;
    @ApiModelProperty(value = "活动内容", dataType = "String", example = "当前活动内容")
    private String content;
    @ApiModelProperty(value = "活动图片", dataType = "", example = "")
    private String picture;


    public Activity() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPARTICIPATION_MAXVALUE() {
        return PARTICIPATION_MAXVALUE;
    }

    public void setPARTICIPATION_MAXVALUE(int PARTICIPATION_MAXVALUE) {
        this.PARTICIPATION_MAXVALUE = PARTICIPATION_MAXVALUE;
    }

    public int getPARTICIPATION_COUNT() {
        return PARTICIPATION_COUNT;
    }

    public void setPARTICIPATION_COUNT(int PARTICIPATION_COUNT) {
        this.PARTICIPATION_COUNT = PARTICIPATION_COUNT;
    }

    public Date getREGISTRATION_START_TIME() {
        return REGISTRATION_START_TIME;
    }

    public void setREGISTRATION_START_TIME(Date REGISTRATION_START_TIME) {
        this.REGISTRATION_START_TIME = REGISTRATION_START_TIME;
    }

    public Date getREGISTRATION_DEADLINE() {
        return REGISTRATION_DEADLINE;
    }

    public void setREGISTRATION_DEADLINE(Date REGISTRATION_DEADLINE) {
        this.REGISTRATION_DEADLINE = REGISTRATION_DEADLINE;
    }

    public Date getACTIVITY_START_TIME() {
        return ACTIVITY_START_TIME;
    }

    public void setACTIVITY_START_TIME(Timestamp ACTIVITY_START_TIME) {
        this.ACTIVITY_START_TIME = ACTIVITY_START_TIME;
    }

    public Date getACTIVITY_DEADLINE() {
        return ACTIVITY_DEADLINE;
    }

    public void setACTIVITY_DEADLINE(Date ACTIVITY_DEADLINE) {
        this.ACTIVITY_DEADLINE = ACTIVITY_DEADLINE;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
