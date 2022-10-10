package com.spring.service.impl;

import com.spring.service.IConverter;
import org.springframework.stereotype.Component;

@Component
public class ARSToGBPConverter implements IConverter {

    private final double RATE = 160.90;

    @Override
    public Double convert(Double cantidad) {
        return cantidad * RATE;
    }
}
