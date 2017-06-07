package com.jk.service.ws.user.impl;

import com.jk.entity.user.UserRequest;
import com.jk.entity.user.UserResponse;
import com.jk.mapper.user.UserMapper;
import com.jk.service.ws.user.WSUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by lx on 2017/6/5.
 */
@Service
@WebService
public class WSUserServiceImpl implements WSUserService{

    @Autowired
    private UserMapper wsUserMapper;
    @Override
    public List<UserResponse> selectUser(UserRequest userRequest) {
        return wsUserMapper.selectUser(userRequest);
    }

    @Override
    public int selectUserCount(UserRequest userRequest) {
        return wsUserMapper.selectUserCount(userRequest);
    }

    @Override
    public void insertUser(UserRequest userRequest) {
        wsUserMapper.insertUserInfo(userRequest);
    }

    @Override
    public void deleteUserByUserID(UserRequest userRequest) {
        wsUserMapper.deleteUserByUserID(userRequest);
    }

    @Override
    public UserResponse selectUserByUserID(UserRequest userRequest) {
        return wsUserMapper.selectUserByUserID(userRequest);
    }

    @Override
    public void updateUserByUserID(UserRequest userRequest) {
        wsUserMapper.updateUserByUserID(userRequest);
    }
}
