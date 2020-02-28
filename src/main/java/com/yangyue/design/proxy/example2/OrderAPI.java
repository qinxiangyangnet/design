package com.yangyue.design.proxy.example2;

/**
 * @program: design
 * @description d订单对象的接口定义
 * @author: yueyang
 * @create: 2020-02-27 05:14
 **/
public interface OrderAPI {

    public String getProuductName();
    public void setProductName(String pruductName,String User);

    public int getOrderNum();
    public void  setOrderNum(int orderNum,String user);
    public void  setOrderUser(String orderUser,String user);
    public String  getOrderUser();
}
