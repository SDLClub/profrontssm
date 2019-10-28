package com.ykx.entity.vo;

import java.math.BigDecimal;

public class ProductVo {
    private Integer productId;
    private String proName;
    private Integer proNumber;
    private Integer orderNumber;
    private BigDecimal proPrice;
    private BigDecimal orderSum;

    public Integer getProNumber() {
        return proNumber;
    }

    public void setProNumber(Integer proNumber) {
        this.proNumber = proNumber;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public BigDecimal getProPrice() {
        return proPrice;
    }

    public void setProPrice(BigDecimal proPrice) {
        this.proPrice = proPrice;
    }

    public BigDecimal getOrderSum() {
        return orderSum;
    }

    public void setOrderSum(BigDecimal orderSum) {
        this.orderSum = orderSum;
    }
}
