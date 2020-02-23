package com.yangyue.design.productmethod.example3;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-22 19:45
 **/
public class Abc {

    private  String name;

    private  ExportFileApi exportFileApi=null;
    public Abc(String nam,ExportFileApi exportFileApi){
        this.name=name;
        this.exportFileApi=exportFileApi;
    }

    public void test(){

        System.out.println(name);
        this.exportFileApi.export("测试数据");
    }
}
