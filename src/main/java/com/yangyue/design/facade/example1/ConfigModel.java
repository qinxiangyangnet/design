package com.yangyue.design.facade.example1;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;

/**
 * @program: design
 * @description: 实例配置描述数据真实配置的数据会很多
 * @author: yueyang
 * @create: 2020-02-17 15:38
 **/
@Data
public class ConfigModel {
    private  boolean needGenPresentaion=true;
    private  boolean needGenBusiness=true;
    private  boolean needGenDAO=true;

    public  boolean isNeedGenPresentaion(){
        return needGenPresentaion;
    }
    public  boolean isNeedGenBusiness(){
        return needGenBusiness;
    }  public  boolean isNeedGenDAO(){
        return needGenDAO;
    }

}
