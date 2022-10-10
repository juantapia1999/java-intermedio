package com.spring.service.impl;

import com.spring.service.IConverter;
import org.springframework.stereotype.Component;

@Component
public class ARSToUSDConverter implements IConverter {
    private static final double RATE = 138.53;

    @Override
    public Double convert(Double cantidad) {
        return cantidad * RATE;
    }
}
