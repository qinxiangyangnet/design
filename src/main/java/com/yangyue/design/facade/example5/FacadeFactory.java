package com.yangyue.design.facade.example5;

/**
 * @program: design
 * @description: 简单工厂
 * 接口，工厂，实现
 * @author: yueyang
 * @create: 2020-02-18 03:07
 **/
public class FacadeFactory {
    private  FacadeFactory(){}

    public static FacadeApi createFacadeApi(){
        return new Facade();
    }
}
