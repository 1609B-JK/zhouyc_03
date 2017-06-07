package com.jk.service.ws.book;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by lx on 2017/5/25.
 */
@WebService
public interface WSBookService {

    @WebMethod(operationName = "gaodashang")
    public void test1();

    @WebMethod
    public int test2();

    @WebMethod
    public int test3(String name);
}
