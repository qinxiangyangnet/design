package com.yangyue.design.adapter.example3;

import java.util.List;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-18 05:42
 **/
public class MyAdapter extends  DefaultAdapter {
    //持有需要被适配的对象
    private LogFileOperateApi adaptee;


    private TimeUtil timeUtil = null;

    /**
     * 构造方法，传入需要被适配的对象
     *
     * @param adaptee
     */
    public MyAdapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    public MyAdapter(LogFileOperateApi adaptee, TimeUtil timeUtil) {
        this.adaptee = adaptee;
        this.timeUtil = timeUtil;
    }

    public Long createLog(LogModel logModel) {
      //用缺省的实现
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
