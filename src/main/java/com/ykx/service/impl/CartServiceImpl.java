package com.ykx.service.impl;

import com.ykx.dao.CartMapper;
import com.ykx.dao.ext.CartExtMapper;
import com.ykx.entity.Cart;
import com.ykx.entity.CartExample;
import com.ykx.entity.dto.CartItemDTO;
import com.ykx.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements ICartService {

    @Autowired
    private CartMapper cartMapper;
    @Autowired
    private CartExtMapper cartExtMapper;

    @Override
    public List<Cart> queryCartByUserId(Integer userId) {
        CartExample cartExample = new CartExample();
        cartExample.createCriteria().andUserIdEqualTo(userId);
        return cartMapper.selectByExample(cartExample);
    }

    @Override
    public int updateCart(Cart cart) {
        return cartMapper.updateByPrimaryKeySelective(cart);
    }

    @Override
    public int insertCart(Cart cart) {
        return cartMapper.insertSelective(cart);
    }

    @Override
    public List<CartItemDTO> qryCartList(Integer userId) {
        return cartExtMapper.qryCartList(userId);
    }

    @Override
    public int delCart(Integer userId, Integer productId) {
        return cartExtMapper.delCartOp(userId, productId);
    }


}
