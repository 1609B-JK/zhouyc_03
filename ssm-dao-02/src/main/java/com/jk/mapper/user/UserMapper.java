package com.jk.mapper.user;

import com.jk.entity.user.UserRequest;
import com.jk.entity.user.UserResponse;

import java.util.List;

/**
 * Created by lenovo on 2017/5/23.
 */
public interface UserMapper {
    UserResponse login(UserRequest userRequest);

    void insertUser(UserRequest userRequest);

    List<UserResponse> selectUser(UserRequest userRequest);

    int selectUserCount(UserRequest userRequest);

    void insertUserInfo(UserRequest userRequest);

    void deleteUserByUserID(UserRequest userRequest);

    UserResponse selectUserByUserID(UserRequest userRequest);

    void updateUserByUserID(UserRequest userRequest);
}
