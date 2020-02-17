package com.yangyue.design.adapter.example4;

import java.util.List;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-18 05:52
 **/
public class TwoDirectAdapter implements  LogDbOperateApi,LogFileOperateApi {
    /**
     * 持有需要被适配的DB存储日志接口对象
     */
    private LogDbOperateApi dbLog;
    /**
     * 持有需要被适配的文件存储日志接口对象
     */
    private LogFileOperateApi fileLog;

    /**
     * 构造方法，传入需要被适配的对象
     * @param dbLog
     * @param fileLog
     */
    public  TwoDirectAdapter(LogDbOperateApi dbLog,LogFileOperateApi fileLog){
        this.dbLog=dbLog;
        this.fileLog=fileLog;

    }
    /*********************文件操作转换成Db实现方式**************************************/
    public Long createLog(LogModel logModel) {
        return null;
    }

    public Boolean updateLog(LogModel logModel) {
        return null;
    }

    public Boolean removeLog(LogModel logModel) {
        return null;
    }

    public List<LogModel> list(LogModel logModel) {
        return null;
    }

    /*********************DB操作转换成文件实现方式**************************************/
    public List<LogModel> readLogFile() {
        return null;
    }

    public void writeLofFile(List<LogModel> list) {

    }
}
