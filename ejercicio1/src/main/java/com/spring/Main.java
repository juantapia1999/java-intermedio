package com.spring;

import com.spring.config.ApplicationConfig;
import com.spring.service.IConverter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        double cantidad = 100;
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ApplicationConfig.class);
        context.refresh();

        IConverter c = context.getBean("ARSToUSDConverter", IConverter.class);
        System.out.println(c.convert(cantidad));
    }
}
