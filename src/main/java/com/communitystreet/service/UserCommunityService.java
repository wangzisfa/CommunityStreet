package com.communitystreet.service;

import com.communitystreet.domain.Community;
import com.communitystreet.domain.User;

import java.util.List;

public interface UserCommunityService {
    int createCommunity(Community community, long stuNumber);
    List<Community> getCommunities(long stuNumber);
    Community getMyCommunity(long stuNumber);
    List<Community> getAll();
    boolean userJoinCommunity(User user, Community community);
    List<Community> getCommunity(String name);
    boolean isAdmin(User user);
}
