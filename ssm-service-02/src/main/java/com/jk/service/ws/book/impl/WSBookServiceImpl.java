package com.jk.service.ws.book.impl;

import com.jk.service.ws.book.WSBookService;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by lx on 2017/5/25.
 */
@WebService
public class WSBookServiceImpl implements WSBookService{
    @Override
    public void test1() {
        System.out.println("执茶在手，笑看纷争");
    }

    @WebMethod(exclude = true)
    @Override
    public int test2() {
        System.out.println("返回数字");
        return 999;
    }

    @Override
    public int test3(String name) {
        System.out.println("接收到人名" + name);
        return 888;
    }
}
