package com.ykx.entity.dto;

import com.ykx.entity.OrderItem;

import java.math.BigDecimal;

public class OrderItemAndProductDto extends OrderItem {
    private Integer productId;
    private String proName;
    private String proImg;
    private BigDecimal proPrice;

    @Override
    public Integer getProductId() {
        return productId;
    }

    @Override
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProImg() {
        return proImg;
    }

    public void setProImg(String proImg) {
        this.proImg = proImg;
    }

    @Override
    public BigDecimal getProPrice() {
        return proPrice;
    }

    @Override
    public void setProPrice(BigDecimal proPrice) {
        this.proPrice = proPrice;
    }

    /*private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }*/
}
