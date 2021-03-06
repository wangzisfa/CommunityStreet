package com.communitystreet.dao;

import com.communitystreet.domain.Community;
import com.communitystreet.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface CommunityDao {
//    Community getCommunityById(@Param("stuNumber") int stuNumber);
    Community getCommunityByAdmin(@Param("stuNumber") int stuNumber);
    List<Community> getCommnuityByName(@Param("communityName") String communityName);
    int createCommunity(Community community, @Param("stuNumber") int stuNumber);
    int userJoinCommunity(@Param("user") User user, @Param("community") Community community);
    // /社团界面的显示社团
    List<Community> getAll();
    // /个人界面中的显示个人加入的社团
    List<Community> getCommunities(@Param("stuNumber") int stuNumber);
}
