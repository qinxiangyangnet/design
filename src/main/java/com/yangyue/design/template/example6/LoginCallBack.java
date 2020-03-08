package com.yangyue.design.template.example6;

/**
 * @program: design
 * @description:  登录控制的模板方法需要回调的接口
 * 需要把所有的需要的接口方法都定义出来
 * @author: yueyang
 * @create: 2020-02-29 15:15
 **/
public interface LoginCallBack {

      LoginModel  findLoginUser(String loginId);

    /**
     *
     * @param pwd
     * @param loginTemplate 调用公共方法或者缺省实现
     * @return
     */
      String  encryptPwd(String pwd,Template loginTemplate);

     boolean  match(LoginModel lm,LoginModel dblm,Template loginTemplate);
}
