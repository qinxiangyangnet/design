package com.yangyue.design.productmethod.example2;

/**
 * @program: design
 * @description: 实现导出数据的业务对象
 * @author: yueyang
 * @create: 2020-02-22 19:00
 **/
public  abstract  class ExportOperate {

    public boolean export(int type, String data) {
        System.out.println("now  进行数据校验");
        System.out.println("now  进行数据转换");
        System.out.println("now  进行数据格式的封装");


        ExportFileApi api = factoryMethod(type);
        //只是想使用接口，而不是用来创建，责任不明确
        //然后真正导出，结构的扩展不是很方便,职责没有分离，

      //  if(type==3){
            //违反了开闭原则,对修改关闭，
        //    api=new ExportXml();
        //}
        return api.export(data);
    }

    public  ExportFileApi  factoryMethod(int type){

        ExportFileApi api = null;
        if (type == 1) {
            api = new ExportText();
        } else if (type == 2) {
            api = new ExportDb();
        }
        return api;
    }
}
