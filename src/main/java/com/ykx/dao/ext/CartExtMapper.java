package com.ykx.dao.ext;

import com.ykx.entity.Cart;
import com.ykx.entity.dto.CartItemDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartExtMapper {
     List<Cart> qryCartByUserId(Integer userId);

    List<CartItemDTO> qryCartList(Integer userId);

    int delCartOp(@Param("user_id") Integer userId, @Param("product_id") Integer productId);
}
