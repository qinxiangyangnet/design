package com.yangyue.design.decorator.example4;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-28 23:22
 **/
public class EncrypetOutputStream  extends OutputStream {
    //持有被装饰的对象
    private OutputStream os=null;
    public EncrypetOutputStream(OutputStream os){
        this.os=os;
    }
    //覆盖父类的write方法
    public void write(int i) throws IOException {
        i=i+2;
        if(i>=(97+26))i=i-26;
        this.os.write(i);
    }
}
