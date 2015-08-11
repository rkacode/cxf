package com.blogspot.rkacode.cxf.hello.order;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface OrderService {

    @WebMethod
    String processOrder(Order order);

}
