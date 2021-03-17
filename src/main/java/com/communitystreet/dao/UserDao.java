package com.communitystreet.dao;

import com.communitystreet.domain.ReqUserLogin;
import com.communitystreet.domain.ReqUserRegister;
import com.communitystreet.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    int updateUser(@Param("user") User user);
//    User getUser();
    int updateUserName(@Param("user") User user);
    int updateUserGender(@Param("user") User user);
    int updateUserNickname(@Param("user") User user);
    int updateUserSignature(@Param("user") User user);
    int updateUserPassword(@Param("user") User user);
    User getUserById(@Param("id") long id);
    User getUserByPassword(@Param("user")ReqUserLogin user);
    void addOne(@Param("user") ReqUserRegister user);
}