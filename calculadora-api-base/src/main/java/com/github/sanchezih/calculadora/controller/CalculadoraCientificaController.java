package com.github.sanchezih.calculadora.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/cientifica")
public class CalculadoraCientificaController {

	public CalculadoraCientificaController() {
	}

	@ApiOperation(value = "Obtener resultado de potencia", notes = "Se debe ingresar una base y un exponente para calcular el resultado")
	@RequestMapping(value = "/potencia", method = RequestMethod.GET, params = { "base", "exponente" })
	public Integer potencia(@RequestParam("base") Integer base, @RequestParam("exponente") Integer exponente) {
		Integer result = base;
		for (int i = 0; i < exponente - 1; i++) {
			result *= base;
		}
		return result;
	}

	@ApiOperation(value = "Obtener factorial del número ingresado")
	@RequestMapping(value = "/factorial", method = RequestMethod.GET, params = { "operando1" })
	public Integer factorial(@RequestParam("operando1") Integer operando1) {
		Integer result = 1;
		for (int i = 1; i <= operando1; i++) {
			result *= i;
		}
		return result;
	}
	
	@ApiOperation(value = "Obtener todos los primos del número ingresado", notes = "Se obtiene un listado de los primos menores y/o iguales al número ingresado")
	@RequestMapping(value = "/primos", method = RequestMethod.GET, params = { "operando1" })
	public List<Integer> primos(@RequestParam("operando1") Integer operando1) {
		List<Integer> result = new ArrayList<Integer>();
		Integer aux = 1;
		Integer contador = 0;
		for (int i = 1; i <= operando1; i++) {
			aux = 1;
			contador = 0;
			while (aux <= i) {
				if (i % aux == 0) {
					contador++;
				}
				aux++;
			}
			if (contador == 2) {
				result.add(i);
			}
		}
		return result;
	}
}
