package com.example.demo.user.repository;

import com.example.demo.user.domain.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user WHERE social_id = #{socialId}")
    User findBySocialId(String socialId);

    @Insert("INSERT INTO user (social_id, name, profile_image_url) VALUES (#{socialId}, #{name}, #{profileImageUrl})")
    void saveUser(User user);
}
