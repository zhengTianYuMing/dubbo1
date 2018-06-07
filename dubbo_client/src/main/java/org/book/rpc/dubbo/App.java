package org.book.rpc.dubbo;

import org.book.rpc.dubbo.service.InvokenService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext run = SpringApplication.run(App.class,args);
        InvokenService service = run.getBean(InvokenService.class);
        System.out.println( "Hello World!"+service.hello.say("rpc") );
    }
}
