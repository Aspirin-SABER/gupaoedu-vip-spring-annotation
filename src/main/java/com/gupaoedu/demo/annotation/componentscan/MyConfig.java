package com.gupaoedu.demo.annotation.componentscan;


import com.gupaoedu.project.controller.MyController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;


@Configuration
@ComponentScan(value = "com.gupaoedu.project",
//        includeFilters = {@Filter(type = FilterType.ANNOTATION,value = {Controller.class})},
//        includeFilters = {@Filter(type = FilterType.ASSIGNABLE_TYPE,value = {MyController.class})},
        includeFilters = {@Filter(type = FilterType.CUSTOM,value = {MyTypeFilter.class})},
        useDefaultFilters =true )
public class MyConfig {

}
