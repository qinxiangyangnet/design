package com.yangyue.design.productmethod.example3;

import com.yangyue.design.productmethod.example2.ExportXml;

/**
 * @program: design
 * @description: 实现导出数据的业务对象
 * @author: yueyang
 * @create: 2020-02-22 19:00
 **/
//public abstract  class ExportOperate {
public   class ExportOperate {

    public boolean export( String data) {
        System.out.println("now  进行数据校验");
        System.out.println("now  进行数据转换");
        System.out.println("now  进行数据格式的封装");

        ExportFileApi api = factoryMethod();
        return api.export(data);
    }
    //工厂方法，创建导出文件对象的接口对象
    public   ExportFileApi factoryMethod(){
        return new com.yangyue.design.productmethod.example3.ExportXml();
    };

    /**
     * 客户端要用Abc对象
     * @param name
     * @return
     */
    public Abc  createAbc(String name){
        return new Abc(name,factoryMethod());
    }
}
