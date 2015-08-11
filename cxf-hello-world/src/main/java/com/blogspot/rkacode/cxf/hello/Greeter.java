package com.blogspot.rkacode.cxf.hello;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Greeter {

    @WebMethod
    String sayHello();

}
