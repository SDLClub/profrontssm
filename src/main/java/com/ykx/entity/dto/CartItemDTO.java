package com.ykx.entity.dto;

import com.ykx.entity.Cart;
import com.ykx.entity.Product;

public class CartItemDTO extends Cart {
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}