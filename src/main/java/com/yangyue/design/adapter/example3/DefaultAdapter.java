package com.yangyue.design.adapter.example3;

import java.util.List;

/**
 * @program: design
 * @description: 缺省适配
 * @author: yueyang
 * @create: 2020-02-18 05:41
 **/
public class DefaultAdapter implements  LogDbOperateApi {
    public Long createLog(LogModel logModel) {
        System.out.println("DB,创建日志。。。。。。。。。。");
        return null;
    }

    public Boolean updateLog(LogModel logModel) {
        return null;
    }

    public Boolean removeLog(LogModel logModel) {
        System.out.println("日志文件  创建日志。。。。。。。。。。");
        return null;
    }

    public List<LogModel> list(LogModel logModel) {
        return null;
    }
}
