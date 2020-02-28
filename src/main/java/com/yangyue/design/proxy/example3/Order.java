package com.yangyue.design.proxy.example3;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-27 05:18
 **/
public class Order implements OrderAPI {

    private String productName;

    private int orderNum;

    private String orderUser;

    public Order(String productName, int orderNum, String orderUser) {
        this.productName = productName;
        this.orderNum = orderNum;
        this.orderUser = orderUser;
    }

    public String getProuductName() {
        return this.productName;
    }

    public void setProductName(String pruductName, String User) {
        this.productName = pruductName;
    }

    public int getOrderNum() {
        return this.orderNum;
    }

    public void setOrderNum(int orderNum, String user) {
        this.orderNum = orderNum;
    }

    public void setOrderUser(String orderUser, String user) {
        this.orderUser = orderUser;
    }

    public String getOrderUser() {
        return this.orderUser;
    }
}
