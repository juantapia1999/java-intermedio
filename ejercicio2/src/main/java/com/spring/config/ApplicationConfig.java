package com.spring.config;

import com.spring.GeneradorDeDocumento;
import com.spring.model.Persona;
import com.spring.service.IExportador;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.spring")
public class ApplicationConfig {

    @Bean(value = "getPersona")
    public Persona getPersona() {
        return new Persona("pepe", 20, "av varela 123");
    }

    @Bean(value = "generadorDeDocumento")
    public GeneradorDeDocumento getGeneradorDeDocumento(@Qualifier(value = "exportadorXML") IExportador exportador) {
        return new GeneradorDeDocumento(exportador);
    }

}
