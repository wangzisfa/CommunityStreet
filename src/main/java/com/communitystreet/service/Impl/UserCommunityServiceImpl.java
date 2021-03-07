package com.communitystreet.service.Impl;

import com.communitystreet.dao.CommunityDao;
import com.communitystreet.dao.SearchDao;
import com.communitystreet.domain.Community;
import com.communitystreet.domain.User;
import com.communitystreet.service.UserCommunityService;
//import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserCommunityServiceImpl implements UserCommunityService {
    @Autowired
    CommunityDao communityDao;
    @Autowired
    SearchDao searchDao;


    @Override
    public int createCommunity(Community community, long stuNumber) {
        return communityDao.createCommunity(community, stuNumber);
    }

    @Override
    public List<Community> getCommunities(long stuNumber) {
        return communityDao.getCommunities(stuNumber);
    }

    //我创建的社团
    @Override
    public Community getMyCommunity(long stuNumber) {
        return communityDao.getCommunityByAdmin(stuNumber);
    }

    @Override
    public List<Community> getAll() {
        List<Community> list = communityDao.getAll();
//        System.out.println(list.toString());
        return list;
    }

    @Override
    public boolean userJoinCommunity(User user, Community community) {
        if (searchDao.searchUserInCommunity(user, community) == 1) {
            return false;
        } else {
            return communityDao.userJoinCommunity(user, community) == 1;
        }
    }

    @Override
    public List<Community> getCommunity(String name) {
        return communityDao.getCommnuityByName(name);
    }

    @Override
    public boolean isAdmin(User user) {
        return false;
    }
}
