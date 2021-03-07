package com.communitystreet.dao;

import com.communitystreet.domain.Community;
import com.communitystreet.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SearchDao {
    List<Object> searchCommunityAndActivityByName(String name);
    int searchUserInCommunity(@Param("user") User user, @Param("community") Community community);

}
