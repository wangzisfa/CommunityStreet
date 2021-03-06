package com.communitystreet.service;

import com.communitystreet.domain.Community;
import com.communitystreet.domain.User;

import java.util.List;

public interface UserCommunityService {
    int createCommunity(Community community, int stuNumber);
    List<Community> getCommunities(int stuNumber);
    Community getMyCommunity(int stuNumber);
    List<Community> getAll();
    boolean UserJoinCommunity(User user, Community community);
    List<Community> getCommunity(String name);
    boolean isAdmin(User user);
}
