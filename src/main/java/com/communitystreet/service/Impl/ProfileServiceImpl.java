package com.communitystreet.service.Impl;

import com.communitystreet.dao.ActivityDao;
import com.communitystreet.dao.UserDao;
import com.communitystreet.domain.Activity;
import com.communitystreet.domain.User;
import com.communitystreet.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProfileServiceImpl implements ProfileService {
    @Autowired
    UserDao userDao;
//    @Autowired
//    CommunityDao communityDao;
    @Autowired
    ActivityDao activityDao;


    @Override
    public User getUser(long stuNumber) {
        //        user.getDateString();
        return userDao.getUserById(stuNumber);
    }

    @Override
    public int updateUser(User user) {
        User checkPassword = userDao.getUserById(user.getStuNumber());
//        if (checkPassword.getPassword().equals(user.getPassword())) {
//            return 0;
//        }
        if (user.getGender() != null) {
            userDao.updateUserGender(user);
        }if (user.getName() != null) {
            userDao.updateUserName(user);
        }if (user.getNickname() != null) {
            userDao.updateUserNickname(user);
        }if (user.getSignature() != null) {
            userDao.updateUserSignature(user);
        }if (user.getPassword() != null && !checkPassword.getPassword().equals(user.getPassword())) {
            userDao.updateUserPassword(user);
        } else if (checkPassword.getPassword().equals(user.getPassword())){
            return 0;
        }

        return 1;
    }

//    @Override
//    public List<Community> getCommunities(int stuNumber) {
//        return communityDao.getCommunities(stuNumber);
//    }

//    @Override
//    public boolean createCommunity(Community community) {
//        return false;
//    }

    @Override
    public List<Activity> getActivities(User user) {
        return null;
    }

    @Override
    public List<User> getUsers(User user) {
        return null;
    }
}
