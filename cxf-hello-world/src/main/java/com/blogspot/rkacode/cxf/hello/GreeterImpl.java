package com.blogspot.rkacode.cxf.hello;

import javax.jws.WebService;

@WebService
public class GreeterImpl implements Greeter {

    @Override
    public String sayHello() {
        return "Hello world!";
    }
}
