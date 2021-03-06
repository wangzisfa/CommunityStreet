package com.communitystreet.domain;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.Example;

@ApiModel(value = "user注册界面请求数据")
public class ReqUserRegister {
    @ApiModelProperty(value = "学号", dataType = "int64", example = "114514")
    private int stuNumber;
    @ApiModelProperty(value = "邮箱", dataType = "String", example = "72@qq.com")
    private String mailbox;
    @ApiModelProperty(value = "密码", dataType = "String", example = "121312931")
    private String password;


    public ReqUserRegister() {
    }

    public ReqUserRegister(int stuNumber, String mailbox, String password) {
        this.stuNumber = stuNumber;
        this.mailbox = mailbox;
        this.password = password;
    }

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ReqUserRegister{" +
                "stuNumber=" + stuNumber +
                ", mailbox='" + mailbox + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
