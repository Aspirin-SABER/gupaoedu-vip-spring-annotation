package com.gupaoedu.demo.annotation.configuration;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class MyTest {

    @Test
    public void test(){
        //Ioc控制反转
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        //默认类名首字母小写
        //其次方法名
        //最后优先取bean注解value
        Object person1 = context.getBean("person");
        Object person2 = context.getBean("person");
        System.out.println(person1==person2);
    }
}
