package org.book.rpc.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.book.rpc.dubbo.IHello;
import org.springframework.stereotype.Component;

@Component
public class InvokenService {

    @Reference
    public IHello hello;
}
