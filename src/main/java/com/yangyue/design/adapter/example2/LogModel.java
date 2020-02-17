package com.yangyue.design.adapter.example2;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: design
 * @description: 日志数据对象
 * @author: yueyang
 * @create: 2020-02-18 04:17
 **/
@Data
public class LogModel implements Serializable {
    private String logId;
    private String operateUser;
    private String operateTime;
    private String logContent;

}
