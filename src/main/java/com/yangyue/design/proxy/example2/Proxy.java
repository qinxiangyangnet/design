package com.yangyue.design.proxy.example2;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-27 05:24
 **/
public class Proxy implements OrderAPI {

    private  Order order=null;

    public Proxy(Order realSubject){
        this.order=realSubject;
    }
    public String getProuductName() {
        return null;
    }

    public void setProductName(String pruductName, String User) {

        if(User.equals(this.getOrderUser())){
            order.setProductName(pruductName,User);
        }else{
            System.out.println("你无权修改订单中的额产品名称");
        }
    }

    public int getOrderNum() {
        return this.order.getOrderNum();
    }

    public void setOrderNum(int orderNum, String user) {
        if(user.equals(this.getOrderUser())){
            order.setOrderNum(orderNum,user);
        }else{
            System.out.println("你无权修改订单中的额产品名称");
        }
    }

    public void setOrderUser(String orderUser, String user) {

    }

    public String getOrderUser() {
        return this.order.getOrderUser();
    }
}
