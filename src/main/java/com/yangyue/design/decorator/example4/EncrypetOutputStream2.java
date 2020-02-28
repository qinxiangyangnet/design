package com.yangyue.design.decorator.example4;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @program: design
 * @description:
 * @author: yueyang
 * @create: 2020-02-28 23:22
 **/
public class EncrypetOutputStream2 extends FilterOutputStream {
    //持有被装饰的对象
    private OutputStream os=null;

    public EncrypetOutputStream2(OutputStream outputStream) {
        super(outputStream);
    }

    //覆盖父类的write方法
    public void write(int i) throws IOException {
        i=i+2;
        if(i>=(97+26))i=i-26;
        this.os.write(i);
    }
}
