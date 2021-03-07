package com.communitystreet.service;

import com.communitystreet.domain.Activity;
import com.communitystreet.domain.User;

import java.util.List;

public interface ActivityInfoService {
    int joinActivity(User user, Activity activity);
    Activity getActivity(String name);
    List<Activity> getActivities(String name);
    List<Activity> getAll();
}
