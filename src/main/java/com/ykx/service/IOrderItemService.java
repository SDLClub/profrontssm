package com.ykx.service;

import com.ykx.entity.OrderItem;
import com.ykx.entity.dto.OrderItemAndProductDto;

import java.util.List;

public interface IOrderItemService {

    int insertOrderItem(OrderItem orderItem);
    List<OrderItemAndProductDto> slOrder(String orderCode);

}
