package com.gupaoedu.demo.annotation.componentscan;

import org.springframework.context.annotation.FilterType;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;


public class MyTypeFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获得当前类的所有注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //获得当前扫描到的类的信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //当前类的所有资源
        Resource resource = metadataReader.getResource();

        String className = classMetadata.getClassName();

        System.out.println("----------------"+className+"------------------------");
        if(className.contains("er"))
            return true;
        return false;
    }
}
