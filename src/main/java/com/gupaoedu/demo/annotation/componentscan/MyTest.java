package com.gupaoedu.demo.annotation.componentscan;

import com.gupaoedu.demo.annotation.componentscan.MyConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class MyTest {

    @Test
    public void test(){
        //Ioc控制反转
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        String[] definitionNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(definitionNames)
                .replaceAll("\\[|\\]","")
                .replaceAll(",","\n"));
    }
}
