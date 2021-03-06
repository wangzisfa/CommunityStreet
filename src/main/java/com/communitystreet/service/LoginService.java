package com.communitystreet.service;

import com.communitystreet.domain.ReqUserLogin;
import com.communitystreet.domain.User;

public interface LoginService {
    boolean login(ReqUserLogin user);
    User getUserById(int id);
}
