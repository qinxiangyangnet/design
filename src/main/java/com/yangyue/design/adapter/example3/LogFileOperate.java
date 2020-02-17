package com.yangyue.design.adapter.example3;

import java.io.*;
import java.util.List;

/**
 * @program: design
 * @description: 实现对日志文件操作
 * @author: yueyang
 * @create: 2020-02-18 04:21
 **/
public class LogFileOperate implements LogFileOperateApi {
    /**
     * 日志文件的路径和名称，默认为当前类路径下Adapter.log
     */
    private String logFilePathName = "Adapter.log";

    public LogFileOperate(String logFilePathName) {
        if (logFilePathName != null && logFilePathName.trim().length() > 0) {
            this.logFilePathName = logFilePathName;
        }
    }

    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream oin = null;
        try {
            File file = new File(logFilePathName);
            if (file.exists()) {
                //典型的装饰模式的应用
                oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
                list = (List<LogModel>) oin.readObject();
            }

        } catch (Exception i) {
            i.printStackTrace();
        } finally {
            try {
                if (oin != null) {
                    oin.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public void writeLofFile(List<LogModel> list) {
        File file = new File(logFilePathName);
        ObjectOutputStream oot = null;
        try {
            oot = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            oot.writeObject(list);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oot != null) {
                    oot.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
