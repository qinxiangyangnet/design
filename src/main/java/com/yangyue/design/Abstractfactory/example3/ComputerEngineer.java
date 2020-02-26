package com.yangyue.design.Abstractfactory.example3;

import com.yangyue.design.Abstractfactory.example2.MainboardFactory;

/**
 * @program: design
 * @description:装机工程师
 * @author: yueyang
 * @create: 2020-02-26 06:55
 **/
public class ComputerEngineer {

    private CPUApi cpuApi=null;
    /**
     * 定义组装机器需要主板
     */
    private MainboardApi mainboardApi=null;

    public  void makeComputer(AbstractFactory  scheme){
        //准备好装机所需要的配件
        prepareHardwares(scheme);
        //组装机器
        //测试机器
        //交付客户

    }
    private void  prepareHardwares(AbstractFactory  scheme){
        this.cpuApi  = scheme.createCPUApi();
         this.mainboardApi = scheme.createMainboardApi();
         //测试一下
         this.cpuApi.calculate();
         this.mainboardApi.installCPU();

    }



}
