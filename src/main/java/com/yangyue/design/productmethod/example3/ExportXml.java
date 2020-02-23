package com.yangyue.design.productmethod.example3;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-22 19:27
 **/
public class ExportXml implements ExportFileApi {

        public boolean export(String data) {
            System.out.println("导出"+data+"到XML文件");

            return true;
        }

}
