package com.spring.service.impl;

import com.spring.model.Persona;
import com.spring.service.IExportador;
import org.springframework.stereotype.Service;

@Service(value = "exportadorXML")
public class ExportadorXML implements IExportador {

    @Override
    public String exportar(Persona persona) {
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        sb.append("<Persona>\n");
        sb.append("\t<nombre>"+persona.getNombre()+"</nombre>\n");
        sb.append("\t<edad>"+persona.getEdad()+"</edad>\n");
        sb.append("\t<direccion>"+persona.getDireccion()+"</direccion>\n");
        sb.append("</Persona>");
        return sb.toString();
    }
}
