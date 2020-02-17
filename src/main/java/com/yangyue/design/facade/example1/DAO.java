package com.yangyue.design.facade.example1;

/**
 * @program: design
 * @description: 数据层
 * @author: yueyang
 * @create: 2020-02-17 15:38
 **/
public class DAO {
    public void generate(){
        ConfigModel cm = ConfigManager.getInstance().getConfigModel();
        if(cm.isNeedGenDAO()){
            //按照要求生成代码，保存代码文件
            System.out.println("正在生成数据层代码文件");
        }
    }
}
