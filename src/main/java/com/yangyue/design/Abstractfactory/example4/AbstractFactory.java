package com.yangyue.design.Abstractfactory.example4;

/**
 * @program: design
 * @description: 可扩展抽象工厂接口
 * @author: yueyang
 * @create: 2020-02-26 07:20
 **/
public interface AbstractFactory {

    /**
     * 一个通用的产品对象
     * @param type
     * @return
     */
    public Object  createPart(int type);
}
