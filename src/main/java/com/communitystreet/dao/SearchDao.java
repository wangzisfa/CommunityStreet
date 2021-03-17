package com.communitystreet.dao;

import com.communitystreet.domain.Activity;
import com.communitystreet.domain.Community;
import com.communitystreet.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SearchDao {
    List<Community> searchCommunityByName(String name);
    List<Activity> searchActivityByName(String name);
    int searchUserInCommunity(@Param("stuNumber") long stuNumber, @Param("name") String name);

}
