package com.communitystreet.service;

import com.communitystreet.domain.User;

public interface TokenService {
    String getToken(User user);
}
