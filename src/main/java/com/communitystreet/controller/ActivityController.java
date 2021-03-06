package com.communitystreet.controller;

import com.communitystreet.domain.Activity;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/activityinfo")
@Controller
@Api
@CrossOrigin
public class ActivityController {
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
