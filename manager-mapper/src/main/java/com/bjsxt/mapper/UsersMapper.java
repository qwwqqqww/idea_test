package com.bjsxt.mapper;

import com.bjsxt.pojo.Users;

import java.util.List;

public interface UsersMapper {
    void insertUser(Users user);
    List<Users> selectUserAll();

}
