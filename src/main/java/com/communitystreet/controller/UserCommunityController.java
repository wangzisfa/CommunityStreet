package com.communitystreet.controller;


import com.alibaba.fastjson.JSONObject;
import com.communitystreet.config.jwt.UserLoginToken;
import com.communitystreet.domain.Community;
import com.communitystreet.domain.User;
import com.communitystreet.service.Impl.TokenServiceImpl;
import com.communitystreet.service.LoginService;
import com.communitystreet.service.UserCommunityService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/community")
@Api
@CrossOrigin
public class UserCommunityController {
    @Autowired
    UserCommunityService communityService;
    @Autowired
    LoginService loginService;

    @GetMapping(value = "/communityinfo")
    @ResponseBody
    @UserLoginToken
    public JSONObject getCommunities(@RequestHeader("Authorization") String token) {
        JSONObject object = new JSONObject();

        List<Community> all = communityService.getAll();
        Community myCreateCommunity = communityService.getMyCommunity(TokenServiceImpl.getStuNumber(token));
        List<Community> myCommunities = communityService.getCommunities(TokenServiceImpl.getStuNumber(token));

        object.put("all", all);
        object.put("myCreateCommunity", myCreateCommunity);
        object.put("myCommunities", myCommunities);

//        if (myCommunities.equals())

        return object;
    }

    @RequestMapping(value = "/createcommunity", method = RequestMethod.POST)
    @ResponseBody
    @UserLoginToken
    public Object createCommunity(@RequestHeader("Authorization") String token, @RequestBody Community community) {
        return communityService.createCommunity(community, TokenServiceImpl.getStuNumber(token)) == 1;
    }


//    @GetMapping("/mycommunity")
//    @ResponseBody
//    public List<Community> getCommunities(@RequestHeader("Authorization") String token) {
////        JSONObject object = new JSONObject();
////        object.put("")
//
////        int stuNumber = Integer.parseInt(JWT.decode(token).getAudience().get(0));
//        return service.getCommunities(TokenServiceImpl.getStuNumber(token));
//    }

    @GetMapping(value = "/join")
    @ResponseBody
    public boolean joinCommunity(@RequestHeader String token, @RequestBody Community community) {
        User user = loginService.getUserById(TokenServiceImpl.getStuNumber(token));

        return communityService.userJoinCommunity(user, community);
    }

    @GetMapping(value = "/search")
    @ResponseBody
    public List<Community> getCommunity(@RequestBody String communityName) {
        return communityService.getCommunity(communityName);
    }

    @RequestMapping(value = "admin", method = RequestMethod.GET)
    @ResponseBody
    public boolean isAdmin(@RequestBody String username) {

        return false;
    }
}
