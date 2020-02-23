package com.yangyue.design.productmethod.example4;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-23 07:42
 **/
public class OperateDB implements  Product {
    public boolean operate(String data) {
        System.out.println("导出数据："+data+"到数据库文件");
        return true;
    }
}
