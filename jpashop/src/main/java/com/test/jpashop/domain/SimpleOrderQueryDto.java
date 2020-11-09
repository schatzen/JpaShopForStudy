package com.test.jpashop.domain;


import com.test.jpashop.domain.Address;
import com.test.jpashop.domain.Order;
import com.test.jpashop.domain.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SimpleOrderQueryDto {

    private Long orderId;
    private String name;
    private LocalDateTime orderDate;
    private OrderStatus orderStatus;
    private Address address;

    public SimpleOrderQueryDto(Order order) {
        orderId = order.getId();
        name = order.getMember().getName();
        orderDate = order.getLocalDateTime();
        orderStatus = order.getStatus();
        address = order.getDelivery().getAddress();
    }


}
