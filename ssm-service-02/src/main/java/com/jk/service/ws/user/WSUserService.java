package com.jk.service.ws.user;

import com.jk.entity.user.UserRequest;
import com.jk.entity.user.UserResponse;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by lx on 2017/6/5.
 */
@WebService
public interface WSUserService {

    @WebMethod
    public List<UserResponse> selectUser(UserRequest userRequest);

    @WebMethod
    public int selectUserCount(UserRequest userRequest);

    @WebMethod
    public void insertUser(UserRequest userRequest);

    @WebMethod
    public void deleteUserByUserID(UserRequest userRequest);

    @WebMethod
    public UserResponse selectUserByUserID(UserRequest userRequest);

    @WebMethod
    public void updateUserByUserID(UserRequest userRequest);
}
