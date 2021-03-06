package com.communitystreet.service.Impl;

import com.communitystreet.dao.CommunityDao;
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
    CommunityDao dao;


    @Override
    public int createCommunity(Community community, long stuNumber) {
        return dao.createCommunity(community, stuNumber);
    }

    @Override
    public List<Community> getCommunities(long stuNumber) {
        return dao.getCommunities(stuNumber);
    }

    //我创建的社团
    @Override
    public Community getMyCommunity(long stuNumber) {
        return dao.getCommunityByAdmin(stuNumber);
    }

    @Override
    public List<Community> getAll() {
        List<Community> list = dao.getAll();
//        System.out.println(list.toString());
        return list;
    }

    @Override
    public boolean UserJoinCommunity(User user, Community community) {
        return false;
    }

    @Override
    public List<Community> getCommunity(String name) {
        return dao.getCommnuityByName(name);
    }

    @Override
    public boolean isAdmin(User user) {
        return false;
    }
}
