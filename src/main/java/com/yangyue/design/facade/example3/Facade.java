package com.yangyue.design.facade.example3;

/**
 * @program: design
 * @description: 外观模式
 * @author: yueyang
 * @create: 2020-02-17 16:06
 **/
public class Facade {

    public void  generate(){
        new Presentation().generate();
        new Buisiness().generate();
        new DAO().generate();
    }

    /**
     * 不推荐，转调，而不是去实现
     */
    public void myMethod(){
        //实现客户得功能要求
        System.out.println("");
    }

}
