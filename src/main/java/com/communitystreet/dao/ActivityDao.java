package com.communitystreet.dao;

import com.communitystreet.domain.Activity;
import com.communitystreet.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface ActivityDao {
    Activity getActivityByUser(@Param("user") User user);
//    Activity getActivityByName(String activityName);
    int userJoinActivity(User user, Activity activity);
    List<Activity> getActivitiesByUser(User user);
    List<Activity> getActivities(@Param("name") String name);
    List<Activity> getAll();
}
