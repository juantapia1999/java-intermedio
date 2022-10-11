package com.spring;

import com.spring.model.Persona;
import com.spring.service.IExportador;
import org.springframework.stereotype.Component;

@Component(value = "generadorDeDocumento")
public class GeneradorDeDocumento {
    private IExportador exportador;

    public GeneradorDeDocumento(IExportador exportador) {
        this.exportador = exportador;
    }

    public void exportarDatos(Persona persona) {
        System.out.println(exportador.exportar(persona));
    }

    public IExportador getExportador() {
        return this.exportador;
    }

    public void setExportador(IExportador exportador) {
        this.exportador = exportador;
    }

    public GeneradorDeDocumento(){}
}
