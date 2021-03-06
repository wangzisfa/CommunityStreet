package com.communitystreet.service.Impl;

import com.communitystreet.dao.UserDao;
import com.communitystreet.domain.ReqUserLogin;
import com.communitystreet.domain.User;
import com.communitystreet.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserDao loginDao;

    @Override
    public boolean login(ReqUserLogin user) {
        User one = loginDao.getUserByPassword(user);
        return one != null;
    }

    @Override
    public User getUserById(long id) {
        return loginDao.getUserById(id);
    }
}
