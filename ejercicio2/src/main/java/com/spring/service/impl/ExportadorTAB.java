package com.spring.service.impl;

import com.spring.model.Persona;
import com.spring.service.IExportador;
import org.springframework.stereotype.Service;

@Service(value = "exportadorTAB")
public class ExportadorTAB implements IExportador {

    @Override
    public String exportar(Persona persona) {
        return persona.getNombre() + "\t" + persona.getEdad() + "\t" + persona.getDireccion();
    }
}
