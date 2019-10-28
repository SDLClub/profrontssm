package com.ykx.entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class OrderItemDto {
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createDate;
    private String realName;
    private String mobile;
    private String address;

    private List<OrderItemAndProductDto> orderDtos;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<OrderItemAndProductDto> getOrderDtos() {
        return orderDtos;
    }

    public void setOrderDtos(List<OrderItemAndProductDto> orderDtos) {
        this.orderDtos = orderDtos;
    }

    @Override
    public String toString() {
        return "OrderItemDto{" +
                "createDate=" + createDate +
                ", realName='" + realName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", orderDtos=" + orderDtos +
                '}';
    }
}
