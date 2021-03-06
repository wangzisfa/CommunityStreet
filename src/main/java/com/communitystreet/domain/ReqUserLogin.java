package com.communitystreet.domain;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "user登录界面请求数据")
public class ReqUserLogin {
    @ApiModelProperty(value = "学号", dataType = "int64", example = "114514")
    private int stuNumber;
    @ApiModelProperty(value = "密码", dataType = "String", example = "114514")
    private String password;

    public ReqUserLogin() {
    }

    public ReqUserLogin(int stuNumber, String password) {
        this.stuNumber = stuNumber;
        this.password = password;
    }

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
