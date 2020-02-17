package com.yangyue.design.adapter.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design
 * @description:客户端
 * @author: yueyang
 * @create: 2020-02-18 04:18
 **/
public class Client {
    public static void main(String[] args) {
        //准备日志内容
        LogModel logModel = new LogModel();
        logModel.setLogId("001");
        logModel.setOperateUser("admin");
        logModel.setOperateTime("2020-2-18 04:39:00");
        logModel.setLogContent("日志文件测试");
        List<LogModel> list=new ArrayList<LogModel>();
        list.add(logModel);

        //写日志文件
        LogFileOperateApi api = new LogFileOperate("");
        api.writeLofFile(list);
        
        //读取日志文件
        List<LogModel> logModels = api.readLogFile();
        System.out.println("readLog"+logModels.toString());


    }
}
