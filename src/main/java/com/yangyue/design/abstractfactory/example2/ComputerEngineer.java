package com.yangyue.design.abstractfactory.example2;

/**
 * @program: design
 * @description:装机工程师
 * @author: yueyang
 * @create: 2020-02-26 06:55
 **/
public class ComputerEngineer {

    private  CPUApi cpuApi=null;
    /**
     * 定义组装机器需要主板
     */
    private MainboardApi mainboardApi=null;

    public  void makeComputer(int cpuType,int mainBoardType){
        //准备好装机所需要的配件
        prepareHardwares(cpuType,mainBoardType);
        //组装机器
        //测试机器
        //交付客户

    }
    private void  prepareHardwares(int cpuType,int mainBoardType){
        this.cpuApi  = CPUFactory.createCPUApi(cpuType);
         this.mainboardApi = MainboardFactory.createMainboardApi(mainBoardType);
         this.cpuApi.calculate();
         this.mainboardApi.installCPU();

    }



}
