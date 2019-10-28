package com.ykx.controller;

import com.ykx.entity.Cart;
import com.ykx.entity.R;
import com.ykx.entity.dto.CartItemDTO;
import com.ykx.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private ICartService cartService;

    @RequestMapping("/list")
    public R cartlist(Integer userId){
        List<CartItemDTO> cartList = cartService.qryCartList(userId);
        return R.ok(cartList);
    }

    @RequestMapping("/add")
    public R addToCart(Integer userId ,Integer productId){

        List<Cart> cartList = cartService.queryCartByUserId(userId);
        //修改cart
        boolean flag = true;
        if (cartList != null && cartList.size()>=1) {
            for (Cart cart : cartList) {
                if (productId==cart.getProductId()) {
                    cart.setProNumber(cart.getProNumber() + 1);
                    int result = cartService.updateCart(cart);
                    if (result == 1) {
                        flag = false;
                        break;
                    }
                }
            }
        }
        //增加cart
        if (flag){
            if (cartList == null){
                cartList = new ArrayList<>();
            }
            Cart cart = new Cart();
            cart.setUserId(userId);
            cart.setProNumber(1);
            cart.setProductId(productId);
            int result = cartService.insertCart(cart);
            if (result == 1){
                cartList.add(cart);
            }
        }

        return R.ok(cartList);
    }

    @RequestMapping("/del")
    public R delCart(Integer userId, Integer productId){
        System.out.println(userId+"   "+productId);
        return R.ok(cartService.delCart(userId,productId));
    }
}
