package com.communitystreet.service;

import com.communitystreet.domain.Activity;
import com.communitystreet.domain.Community;
import com.communitystreet.domain.User;

import java.util.List;

public interface ProfileService {
    User getUser(int stuNumber);
    int updateUser(User user);
//    List<Community> getCommunities(int stuNumber);
//    boolean createCommunity(Community community);
    List<Activity> getActivities(User user);
    //friends
    List<User> getUsers(User user);
}
