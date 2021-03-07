package com.communitystreet.service.Impl;

import com.communitystreet.dao.ActivityDao;
import com.communitystreet.domain.Activity;
import com.communitystreet.domain.User;
import com.communitystreet.service.ActivityInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityInfoServiceImpl implements ActivityInfoService {
    @Autowired
    private ActivityDao activityDao;

    @Override
    public int joinActivity(User user , Activity activity) {
        return activityDao.userJoinActivity(user,activity);
    }

    @Override
    public Activity getActivity(String activityName) {
        return getActivity(activityName);
    }

    @Override
    public List<Activity> getActivities(String name) {
        return activityDao.getActivities(name);
    }

    @Override
    public List<Activity> getAll() {
        return activityDao.getAll();
    }


    public Activity getActivity(User user){
        return getActivity(user);
    }
}
