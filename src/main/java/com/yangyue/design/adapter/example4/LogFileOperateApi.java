package com.yangyue.design.adapter.example4;

import java.util.List;

/**
 * @program: design
 * @description: 日志文件操作接口
 * @author: yueyang
 * @create: 2020-02-18 04:19
 **/
public interface LogFileOperateApi {
    /**
     * 读取日志文件
     * @return
     */
    public List<LogModel>  readLogFile();

    /**
     * 写日志文件
     * @param list
     */
    public void  writeLofFile(List<LogModel> list);
}
