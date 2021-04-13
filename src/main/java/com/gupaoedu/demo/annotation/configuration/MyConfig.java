package com.gupaoedu.demo.annotation.configuration;

import com.gupaoedu.project.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Person person(){
        return new Person();
    }
}
