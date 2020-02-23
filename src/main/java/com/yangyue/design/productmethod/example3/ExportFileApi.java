package com.yangyue.design.productmethod.example3;

/**
 * @program: design
 * @description:  导出文件对象的接口
 * @author: yueyang
 * @create: 2020-02-22 18:58
 **/
public interface ExportFileApi {
    /**
     * 导出内容成为文件
     * @param data 需要导出的数据
     * @return 是否导出成功
     */
    public  boolean  export(String data);
}
