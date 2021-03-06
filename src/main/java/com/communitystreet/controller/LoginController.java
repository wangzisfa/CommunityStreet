package com.communitystreet.controller;


import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.JWT;
import com.communitystreet.config.jwt.UserLoginToken;
import com.communitystreet.domain.ReqUserLogin;
import com.communitystreet.domain.User;
import com.communitystreet.service.LoginService;
import com.communitystreet.service.TokenService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/login")
@Api
@CrossOrigin
public class LoginController {
    @Autowired
    private LoginService service;
    @Autowired
    private TokenService tokenService;

    @PostMapping("/check")
    @ApiResponse(code = 200, message = "登录确认")
    @ApiOperation(value = "获取用户登录信息", produces = "application/json", httpMethod = "POST")
    @ApiImplicitParam(paramType = "ReqUserLogin", name = "user")
    public Object isLogin(@RequestBody ReqUserLogin reqUserLogin) {
        JSONObject object = new JSONObject();
        User user = service.getUserById(reqUserLogin.getStuNumber());
        if (user == null) {
            object.put("message", false);
        } else {
            if (!user.getPassword().equals(reqUserLogin.getPassword())) {
                object.put("message", false);
            } else {
                String token = tokenService.getToken(user);
                object.put("token", token);
                object.put("message", true);
            }
        }
        return object;


//        object.put("message", "login failed.");
//        object.put("status", 500);
//        object.put("token", tokenService.getToken());
//        return object;
//        return service.login(user);
    }


//    @UserLoginToken
//    @RequestMapping("/getusernumber")
//    @ResponseBody
//    public Object getToken(@RequestHeader("token") String token) {
//        //User user = object.getObject("user", User.class);
////        String token = object.getString("token");
//        int stuNumber = Integer.parseInt(JWT.decode(token).getAudience().get(0));
//        //System.out.println(stuNumber);
//        ReqUserLogin user = new ReqUserLogin();
//        user.setStuNumber(stuNumber);
//        User userDatabase = service.getUserById(user.getStuNumber());
//        String generateToken = tokenService.getToken(userDatabase);
//
//
//        return generateToken.equals(token);
//    }
}
