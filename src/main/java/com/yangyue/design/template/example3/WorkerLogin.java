package com.yangyue.design.template.example3;

import com.yangyue.design.template.example4.LoginModel;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-29 10:15
 **/
public class WorkerLogin {

    public boolean login(com.yangyue.design.template.example3.LoginModel loginModel) {
        WorkerModel workerModel = this.findUserByUserId(loginModel.getWorkerId());
        if (workerModel != null) {
            String emcryptPwd = this.encrypt(loginModel.getPwd());
            //检查工作人员编号和密码是否匹配
            if (workerModel.getPwd().equals(emcryptPwd) && loginModel.getWorkerId().equals(workerModel.getWorkerId())) {
                return true;
            }
        }
        return false;

    }

    /**
     * 对密码数据进行加密
     * @param pwd
     * @return
     */
    private String encrypt(String pwd) {
        //省略了
        return pwd;
    }

    private WorkerModel findUserByUserId(String userId) {
        WorkerModel userModel = new WorkerModel();
        userModel.setWorkerId(userId);
        userModel.setName("worker1");
        userModel.setPwd("worker1");
        userModel.setUuid("worker1001");
        return userModel;
    }
}
