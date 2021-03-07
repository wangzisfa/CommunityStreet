package com.communitystreet.service;

import com.communitystreet.domain.Community;
import com.communitystreet.domain.User;

import java.util.List;

public interface UserCommunityService {
    int createCommunity(Community community, long stuNumber);
    List<Community> getCommunities(long stuNumber);
    Community getMyCommunity(long stuNumber);
    List<Community> getAll();
    boolean userJoinCommunity(long stuNumber, String name);
    List<Community> getCommunityByName(String name);
    boolean isAdmin(User user);
}
