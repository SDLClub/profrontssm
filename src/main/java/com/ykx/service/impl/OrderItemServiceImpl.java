package com.ykx.service.impl;

import com.ykx.dao.OrderItemMapper;
import com.ykx.dao.ext.OrderItemExtMapper;
import com.ykx.entity.OrderItem;
import com.ykx.entity.dto.OrderItemAndProductDto;
import com.ykx.service.IOrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements IOrderItemService {
    @Autowired
    private OrderItemMapper orderItemMapper;
    @Autowired
    private OrderItemExtMapper orderItemExtMapper;
    @Override
    public int insertOrderItem(OrderItem orderItem) {
        return orderItemMapper.insertSelective(orderItem);
    }

    @Override
    public List<OrderItemAndProductDto> slOrder(String orderCode) {
        return orderItemExtMapper.slProAndOrd(orderCode);
    }

}
