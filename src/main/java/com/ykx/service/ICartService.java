package com.ykx.service;

import com.ykx.entity.Cart;
import com.ykx.entity.dto.CartItemDTO;

import java.util.List;

public interface ICartService {
    List<Cart> queryCartByUserId(Integer userId);

    int updateCart(Cart cart);

    int insertCart(Cart cart);

    int delCart(Integer userId,Integer productId);

    List<CartItemDTO> qryCartList(Integer userId);

}
