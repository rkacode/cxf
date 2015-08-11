package com.blogspot.rkacode.cxf.hello.order;

import javax.jws.WebService;
import java.util.UUID;

@WebService
public class OrderServiceImpl implements OrderService {
    @Override
    public String processOrder(Order order) {

        return UUID.randomUUID().toString();

    }
}
