package com.yangyue.design.adapter.example3;


import com.yangyue.design.adapter.example1.Adaptee;

import java.util.List;

/**
 * @program: design
 * @description: 适配器
 * 用第一版去实现第二版的功能，接口不变
 * @author: yueyang
 * @create: 2020-02-18 04:48
 **/
public class Adapter implements LogDbOperateApi {

    //持有需要被适配的对象
    private LogFileOperateApi adaptee;


    private TimeUtil timeUtil = null;

    /**
     * 构造方法，传入需要被适配的对象
     *
     * @param adaptee
     */
    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    public Adapter(LogFileOperateApi adaptee, TimeUtil timeUtil) {
        this.adaptee = adaptee;
        this.timeUtil = timeUtil;
    }

    public Long createLog(LogModel logModel) {
        //Adaptee原来没有的功能，加一个新的功能，记录创建日志的时间或者
        //适配多个Adaptee
        this.timeUtil.begin();
        //读取文件
        List<LogModel> logModels = adaptee.readLogFile();
        logModels.add(logModel);
        //重新写入
        adaptee.writeLofFile(logModels);
        long b = System.currentTimeMillis();
        this.timeUtil.end();
        this.timeUtil.show();
        return null;
    }

    public Boolean updateLog(LogModel logModel) {
        return null;
    }

    public Boolean removeLog(LogModel logModel) {
        //读取文件
        List<LogModel> logModels = adaptee.readLogFile();
        logModels.remove(logModel);
        //重新写入
        adaptee.writeLofFile(logModels);
        return null;
    }

    public List<LogModel> list(LogModel logModel) {
        return adaptee.readLogFile();
    }


}
