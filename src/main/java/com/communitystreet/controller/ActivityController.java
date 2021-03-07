package com.communitystreet.controller;

import com.communitystreet.domain.Activity;
import com.communitystreet.service.ActivityInfoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/activityinfo")
@Controller
@Api
@CrossOrigin
public class ActivityController {
    @Autowired
    ActivityInfoService service;

    @GetMapping
    @ResponseBody
    public List<Activity> getAll() {
        return service.getAll();
    }


    @RequestMapping(value = "/join", method = RequestMethod.GET)
    @ResponseBody
    public boolean joinActivity(@RequestBody String username) {
        return false;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    @ResponseBody
    public Activity getActivity(@RequestBody String activityName) {
        return new Activity();
    }
}
