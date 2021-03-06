package com.communitystreet.controller;

import com.alibaba.fastjson.JSONObject;
import com.communitystreet.config.jwt.UserLoginToken;
import com.communitystreet.domain.Activity;
import com.communitystreet.domain.User;
import com.communitystreet.service.Impl.TokenServiceImpl;
import com.communitystreet.service.ProfileService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/profile")
@Api
@CrossOrigin
public class ProfileController {
    @Autowired
    ProfileService service;


    @GetMapping
    @ResponseBody
    @UserLoginToken
    public User getUser(@RequestHeader("Authorization") String token) {
//        int stuNumber = Integer.parseInt(JWT.decode(token).getAudience().get(0));
        return service.getUser(TokenServiceImpl.getStuNumber(token));
    }


    @PostMapping(value = "/updateuser")
    @ResponseBody
    @UserLoginToken
//    @PassToken
    public Object updateUser(@RequestHeader("Authorization") String token, @RequestBody JSONObject object) {
        User user = new User();
        user.setPassword(object.getString("password"));
        user.setName(object.getString("name"));
        user.setNickname(object.getString("nickname"));
        user.setSignature(object.getString("signature"));
        user.setStuNumber(TokenServiceImpl.getStuNumber(token));
        user.setGender(object.getString("gender"));

//        String gender = object.getString("gender");
//        if (gender.equals("男")) {
//            user.setGen(User.GENDER.M);
//        } else {
//            user.setGen(User.GENDER.F);
//        }

        return service.updateUser(user) == 1;
    }


//    @GetMapping("/mycommunity")
//    @ResponseBody
//    public List<Community> getCommunities(@RequestHeader("token") String token) {
//        int stuNumber = Integer.parseInt(JWT.decode(token).getAudience().get(0));
//        return service.getCommunities(stuNumber);
//    }


//    @RequestMapping(value = "/createcommunity", method = RequestMethod.POST)
//    @ResponseBody
//    public boolean createCommunity(Community community) {
//        return false;
//    }

    @RequestMapping(value = "/myactivities", method = RequestMethod.GET)
    @ResponseBody
    public List<Activity> getActivities(@RequestBody String username) {
        return new ArrayList<>();
    }

    @RequestMapping(value = "/friends", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getFriends(@RequestBody String username) {

        return new ArrayList<>();
    }
}
