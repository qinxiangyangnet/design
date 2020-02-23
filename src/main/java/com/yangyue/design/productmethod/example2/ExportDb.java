package com.yangyue.design.productmethod.example2;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-22 19:02
 **/
public class ExportDb implements  ExportFileApi {
    public boolean export(String data) {

        System.out.println("导出"+data+"到数据库备份文件");

        return true;
    }
}
