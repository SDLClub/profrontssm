package com.ykx.dao.ext;

import com.ykx.entity.dto.OrderItemAndProductDto;

import java.util.List;

public interface OrderItemExtMapper {
    List<OrderItemAndProductDto> slProAndOrd(String orderCode);
}
