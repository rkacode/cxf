package com.blogspot.rkacode.cxf.service;


import com.blogspot.rkacode.cxf.api.Order;
import com.blogspot.rkacode.cxf.api.OrderService;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class OrderServiceImpl implements OrderService {

    @Override
    @WebMethod
    public String submitOrder(Order order) {
        return "SUBMITTED";
    }
}
