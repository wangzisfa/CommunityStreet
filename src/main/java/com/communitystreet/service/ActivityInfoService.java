package com.communitystreet.service;

import com.communitystreet.domain.Activity;
import com.communitystreet.domain.User;

public interface ActivityInfoService {
    int joinActivity(User user, Activity activity);
    Activity getActivity(String name);
}
