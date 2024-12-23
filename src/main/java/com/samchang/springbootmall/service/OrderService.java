package com.samchang.springbootmall.service;

import com.samchang.springbootmall.dto.CreateOrderRequest;
import com.samchang.springbootmall.dto.OrderQueryParams;
import com.samchang.springbootmall.model.Order;

import java.util.List;

public interface OrderService {
    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
