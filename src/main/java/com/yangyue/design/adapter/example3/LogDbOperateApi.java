package com.yangyue.design.adapter.example3;

import java.util.List;

/**
 * @program: design
 * @description: 定义操作日志的应用接口
 * @author: yueyang
 * @create: 2020-02-18 04:46
 **/
public interface LogDbOperateApi {

    public  Long createLog(LogModel logModel);

    public Boolean  updateLog(LogModel logModel);

    public Boolean removeLog(LogModel logModel);

    public List<LogModel> list(LogModel logModel);
}
