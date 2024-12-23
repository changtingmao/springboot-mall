package com.samchang.springbootmall.service;

import com.samchang.springbootmall.dto.CreateOrderRequest;
import com.samchang.springbootmall.model.Order;

public interface OrderService {
    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
