package com.yangyue.design.productmethod.example3;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-22 19:19
 **/
public class ExportDbOperate extends  ExportOperate{
    public ExportFileApi factoryMethod() {
        return new ExportDb();
    }
}
