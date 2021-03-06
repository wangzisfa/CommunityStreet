package com.communitystreet.service.Impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.communitystreet.domain.User;
import com.communitystreet.service.TokenService;
import org.springframework.stereotype.Service;


@Service
public class TokenServiceImpl implements TokenService {
    @Override
    public String getToken(User user) {
        String token = "";
        //坑 不能直接存密码
        //将学号转换为String存储
        token = JWT.create().withAudience(String.valueOf(user.getStuNumber()))
                .sign(Algorithm.HMAC256(String.valueOf(user.getStuNumber())));

        return token;
    }

    public static int getStuNumber(String token) {
        return Integer.parseInt(JWT.decode(token).getAudience().get(0));
    }
}
