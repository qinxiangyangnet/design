package com.yangyue.design.adapter.example4;

import java.util.List;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-18 05:51
 **/
public class LogDbOperate implements LogDbOperateApi {
    public Long createLog(LogModel logModel) {
        System.out.println("create log");
        return null;
    }

    public Boolean updateLog(LogModel logModel) {
        System.out.println("update log");
        return null;
    }

    public Boolean removeLog(LogModel logModel) {
        System.out.println("remove log");
        return null;
    }

    public List<LogModel> list(LogModel logModel) {
        System.out.println("log list");
        return null;
    }
}
