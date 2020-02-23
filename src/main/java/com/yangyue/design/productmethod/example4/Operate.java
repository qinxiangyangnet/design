package com.yangyue.design.productmethod.example4;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-23 07:45
 **/
public abstract class Operate {

    public  boolean  operate(int type,String data){
        System.out.println("校验数据");
        System.out.println("数据转换");
        System.out.println("数据导入");
        Product pp=factoryMethod();

       return pp.operate(data);
    }

    public abstract Product  factoryMethod();
}
