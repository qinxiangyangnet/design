package com.yangyue.design.facade.example5;

/**
 * @program: design
 * @description:逻辑层
 * @author: yueyang
 * @create: 2020-02-17 15:37
 **/
public class Buisiness {
    public void generate(){
        ConfigModel cm = ConfigManager.getInstance().getConfigModel();
        if(cm.isNeedGenBusiness()){
            System.out.println("正在生成逻辑层代码文件");
        }
    }
}
