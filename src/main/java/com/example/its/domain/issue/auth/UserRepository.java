package com.example.its.domain.issue.auth;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.*;

import java.util.Optional;

@Mapper
public interface UserRepository {
    @Select("select * from users where username = #{username}")
    Optional<User> findByUsername(String username);

    @Select("select * from users")
    List<User> findAll();

    @Insert("insert into users (username, password) values (#{username},#{password})")
    void insert(@Param("username") String username, @Param("password")String password);
}
