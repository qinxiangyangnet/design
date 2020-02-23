package com.yangyue.design.productmethod.example4;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-23 07:43
 **/
public class OperateText  implements  Product {
    public boolean operate(String data) {
        System.out.println("导出数据："+data+"到文本文件");
        return true;
    }
}
