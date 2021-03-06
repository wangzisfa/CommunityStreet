package com.communitystreet.dao;

import java.util.List;

public interface SearchDao {
    List<Object> searchCommunityAndActivityByName(String name);
}
