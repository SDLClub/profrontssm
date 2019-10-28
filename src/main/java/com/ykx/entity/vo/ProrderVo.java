package com.ykx.entity.vo;

public class ProrderVo {
    private Integer userId;
    private String realName;
    private String mobile;
    private String address;
    private String productVos;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getProductVos() {
        return productVos;
    }

    public void setProductVos(String productVos) {
        this.productVos = productVos;
    }

    @Override
    public String toString() {
        return "ProrderVo{" +
                "userId='" + userId + '\'' +
                ", realName='" + realName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", productVos='" + productVos + '\'' +
                '}';
    }
}
