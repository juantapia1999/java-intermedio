package com.spring.service.impl;

import com.spring.model.Persona;
import com.spring.service.IExportador;
import org.springframework.stereotype.Service;

@Service(value = "exportadorCSV")
public class ExportadorCSV implements IExportador {

    @Override
    public String exportar(Persona persona) {
        return persona.getNombre() + "," + persona.getEdad() + "," + persona.getDireccion();
    }
}
