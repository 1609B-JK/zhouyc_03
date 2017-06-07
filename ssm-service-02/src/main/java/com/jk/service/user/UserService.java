package com.jk.service.user;

import com.jk.entity.user.UserRequest;
import com.jk.entity.user.UserResponse;

import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/5/23.
 */
public interface UserService {
    Map<String,Object> login(UserRequest userRequest);

    UserResponse selectUserByUserAccount(UserRequest userRequest);

    int regedit(UserRequest userRequest);

    public List<UserResponse> selectUser(UserRequest userRequest);

    public int selectUserCount(UserRequest userRequest);

    void insertUser(UserRequest userRequest);

    void deleteUserByUserID(UserRequest userRequest);

    UserResponse selectUserByUserID(UserRequest userRequest);

    void updateUserByUserID(UserRequest userRequest);
}
