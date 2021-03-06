package com.communitystreet.controller;


import com.alibaba.fastjson.JSONObject;
import com.communitystreet.config.jwt.UserLoginToken;
import com.communitystreet.domain.Community;
import com.communitystreet.service.Impl.TokenServiceImpl;
import com.communitystreet.service.TokenService;
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
    UserCommunityService service;

    @GetMapping(value = "/communityinfo")
    @ResponseBody
    @UserLoginToken
    public JSONObject getCommunities(@RequestHeader("Authorization") String token) {
        JSONObject object = new JSONObject();

        List<Community> all = service.getAll();
        Community myCreateCommunity = service.getMyCommunity(TokenServiceImpl.getStuNumber(token));
        List<Community> myCommunities = service.getCommunities(TokenServiceImpl.getStuNumber(token));

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
        return service.createCommunity(community, TokenServiceImpl.getStuNumber(token)) == 1;
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

    @RequestMapping(value = "/join", method = RequestMethod.GET)
    @ResponseBody
    public boolean joinCommunity(@RequestBody JSONObject object) {
        return false;
    }

    @GetMapping(value = "/search")
    @ResponseBody
    public List<Community> getCommunity(@RequestBody String communityName) {
        return service.getCommunity(communityName);
    }

    @RequestMapping(value = "admin", method = RequestMethod.GET)
    @ResponseBody
    public boolean isAdmin(@RequestBody String username) {

        return false;
    }
}
