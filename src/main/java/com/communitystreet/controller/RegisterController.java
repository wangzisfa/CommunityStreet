package com.communitystreet.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.communitystreet.config.jwt.PassToken;
import com.communitystreet.config.jwt.UserLoginToken;
import com.communitystreet.domain.ReqUserRegister;
import com.communitystreet.service.RegisterService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/register")
@Api
@CrossOrigin
public class RegisterController {
    @Autowired
    private RegisterService service;
    private int mailCode;

    @PostMapping("/verifyuser")
    @ApiOperation(value = "获取用户id 邮箱 密码", produces = "application/json", httpMethod = "POST")
    @ApiImplicitParam(paramType = "ReqUserRegister", name = "user")
    @ApiResponse(code = 200, message = "注册确认")
    public String verifyUser(@RequestBody ReqUserRegister user) {
//        System.out.println(user.getMailbox() + user.getPassword() + user.getStuNumber());
//        if (mailCode == user.getVerifyCode()) {
//            if (service.isNewUser(user)) {
//                return "success";
//            } else {
//                return "fail";
//            }
//        } else {
//            return "code error";
//        }


        if (service.isNewUser(user)) {
            return "success";
        } else {
            return "fail";
        }
    }

    @PostMapping(value = "/verifycode", produces = "application/json;charset=utf-8")
    @ResponseBody
    @ApiOperation(value = "发送验证码", produces = "application/json", httpMethod = "POST")
    @ApiImplicitParam(paramType = "String", name = "mailbox")
    @ApiResponse(code = 200,message = "验证码发送")
    public int sendMail(@RequestBody ReqUserRegister user) {
//        String mailbox = object.getString("mailbox");
//        JSONObject object = JSON.parseObject(mailbox);
//        System.out.println("Controller mailbox: " + mailbox);
//        System.out.println("json mailbox : " + object.getString("mailbox"));


        return service.sendMail(user.getMailbox());
    }


    @GetMapping("/getUser")
    public String getUser() {
        return "success";
    }

}
