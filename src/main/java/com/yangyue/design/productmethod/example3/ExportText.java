package com.yangyue.design.productmethod.example3;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-22 19:02
 **/
public class ExportText implements ExportFileApi {
    public boolean export(String data) {
        System.out.println("导出"+data+"到文本文件");

        return true;
    }
}
