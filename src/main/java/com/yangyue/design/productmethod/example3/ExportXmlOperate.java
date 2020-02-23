package com.yangyue.design.productmethod.example3;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-22 19:28
 **/
public class ExportXmlOperate extends  ExportOperate {
    public ExportFileApi factoryMethod() {
        return new ExportXml();
    }
}
