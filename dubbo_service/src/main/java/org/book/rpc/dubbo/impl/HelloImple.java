package org.book.rpc.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.book.rpc.dubbo.IHello;
@Service
public class HelloImple implements IHello {

    @Override
    public String say(String msg) {
        System.out.println("你好"+msg);
        return msg;
    }
}
