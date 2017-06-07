package com.jk.controller.freemarker;

import com.jk.entity.user.UserRequest;
import com.jk.entity.user.UserResponse;
import com.jk.service.user.UserService;
import com.jk.service.ws.user.WSUserService;
import common.FreemarkerUtil;
import common.JsonUtil;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lx on 2017/6/6.
 */
@Controller
public class FreemarkerController {

    @Autowired
    private UserService userService;
    @RequestMapping("test1")
    public void test1(UserRequest userRequest,HttpServletRequest request,HttpServletResponse response){
            Map<String, Object> map = new HashMap<String, Object>();
            int i = userService.selectUserCount(userRequest);
            userRequest.setTotalCount(i);
            userRequest.setPageIndex(userRequest.getPageIndex());
            userRequest.setPageSize(userRequest.getPageSize());
            userRequest.computePageInfo();
            List<UserResponse> userResponses = userService.selectUser(userRequest);
            map.put("total", userRequest);
            map.put("listt", userResponses);
            FreemarkerUtil.getConfigurationAndTemplate(map,"/templates","select.ftl",request,response);

    }

    @RequestMapping("toInsertPage")
    public void toInsertPage(HttpServletRequest request,HttpServletResponse response){
        FreemarkerUtil.getConfigurationAndTemplate(null,"/templates","insert.ftl",request,response);
    }

    @RequestMapping("insertUser")
    public void insertUser(UserRequest userRequest,HttpServletResponse response){
        userService.insertUser(userRequest);
        JsonUtil.jsonOutByJson("{}",response);
    }
    @RequestMapping("deleteUserByUserID")
    public void deleteUserByUserID(UserRequest userRequest,HttpServletResponse response){
        userService.deleteUserByUserID(userRequest);
        JsonUtil.jsonOutByJson("{}",response);
    }

    @RequestMapping("selectUserByUserID")
    public void selectUserByUserID(UserRequest userRequest,HttpServletRequest request,HttpServletResponse response){
        UserResponse userResponse = userService.selectUserByUserID(userRequest);
        FreemarkerUtil.getConfigurationAndTemplate(userResponse,"/templates","update.ftl",request,response);

    }

    @RequestMapping("updateUserByUserID")
    public void updateUserByUserID(UserRequest userRequest,HttpServletResponse response){
        userService.updateUserByUserID(userRequest);
        JsonUtil.jsonOutByJson("{}",response);
    }
}
