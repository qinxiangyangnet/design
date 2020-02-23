package com.yangyue.design.productmethod.example4;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-23 07:51
 **/
public class OperateDBTT extends Operate {
    public Product factoryMethod() {
        return new OperateDB();
    }
}
