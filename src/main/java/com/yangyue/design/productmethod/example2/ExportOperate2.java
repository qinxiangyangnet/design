package com.yangyue.design.productmethod.example2;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-23 08:04
 **/
public class ExportOperate2 extends ExportOperate {
    public ExportFileApi factoryMethod(int type) {
        ExportFileApi api=null;
        if(type==3){
            api=new ExportXml();
        }else{
            super.factoryMethod(type);
        }
        return api;
    }
}
