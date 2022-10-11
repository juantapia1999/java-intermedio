package com.spring;

import com.spring.config.ApplicationConfig;
import com.spring.model.Persona;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /*Persona persona = new Persona("Victoria", 37, "Lugones 4402");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        GeneradorDeDocumento generadorDeDocumento = (GeneradorDeDocumento) applicationContext
                .getBean("generadorDeDocumento");
        generadorDeDocumento.exportarDatos(persona);*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ApplicationConfig.class);
        context.refresh();

        Persona persona = context.getBean("getPersona", Persona.class);
        GeneradorDeDocumento generadorDeDocumento = context.getBean("generadorDeDocumento", GeneradorDeDocumento.class);

        generadorDeDocumento.exportarDatos(persona);

    }
}
