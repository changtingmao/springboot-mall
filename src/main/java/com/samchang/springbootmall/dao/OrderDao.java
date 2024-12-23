package com.samchang.springbootmall.dao;

import com.samchang.springbootmall.model.Order;
import com.samchang.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {
    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
