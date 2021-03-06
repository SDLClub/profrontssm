package com.ykx.entity;

import java.math.BigDecimal;

public class OrderItem {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.orderitem_id
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    private Integer orderitemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.order_id
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.product_id
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    private Integer productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.comment_id
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    private Integer commentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.order_number
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    private Integer orderNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.order_sum
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    private BigDecimal orderSum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.pro_number
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    private Integer proNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.pro_price
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    private BigDecimal proPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.orderCode
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    private String ordercode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitem.real_name
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    private String realName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.orderitem_id
     *
     * @return the value of orderitem.orderitem_id
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public Integer getOrderitemId() {
        return orderitemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.orderitem_id
     *
     * @param orderitemId the value for orderitem.orderitem_id
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public void setOrderitemId(Integer orderitemId) {
        this.orderitemId = orderitemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.order_id
     *
     * @return the value of orderitem.order_id
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.order_id
     *
     * @param orderId the value for orderitem.order_id
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.product_id
     *
     * @return the value of orderitem.product_id
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.product_id
     *
     * @param productId the value for orderitem.product_id
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.comment_id
     *
     * @return the value of orderitem.comment_id
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.comment_id
     *
     * @param commentId the value for orderitem.comment_id
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.order_number
     *
     * @return the value of orderitem.order_number
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public Integer getOrderNumber() {
        return orderNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.order_number
     *
     * @param orderNumber the value for orderitem.order_number
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.order_sum
     *
     * @return the value of orderitem.order_sum
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public BigDecimal getOrderSum() {
        return orderSum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.order_sum
     *
     * @param orderSum the value for orderitem.order_sum
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public void setOrderSum(BigDecimal orderSum) {
        this.orderSum = orderSum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.pro_number
     *
     * @return the value of orderitem.pro_number
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public Integer getProNumber() {
        return proNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.pro_number
     *
     * @param proNumber the value for orderitem.pro_number
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public void setProNumber(Integer proNumber) {
        this.proNumber = proNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.pro_price
     *
     * @return the value of orderitem.pro_price
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public BigDecimal getProPrice() {
        return proPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.pro_price
     *
     * @param proPrice the value for orderitem.pro_price
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public void setProPrice(BigDecimal proPrice) {
        this.proPrice = proPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.orderCode
     *
     * @return the value of orderitem.orderCode
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public String getOrdercode() {
        return ordercode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.orderCode
     *
     * @param ordercode the value for orderitem.orderCode
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode == null ? null : ordercode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitem.real_name
     *
     * @return the value of orderitem.real_name
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitem.real_name
     *
     * @param realName the value for orderitem.real_name
     *
     * @mbg.generated Mon Oct 21 14:01:17 CST 2019
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }
}