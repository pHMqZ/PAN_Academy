package com.vinicius.app;

import static org.junit.Assert.*;

import javax.validation.ConstraintViolationException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculadoraModelTest {

	@Rule
	public ExpectedException expectedException;
	
	
	@Test
	public void testeQuadrado() {
		CalculadoraModel calc = new CalculadoraModel();
		double num = calc.getQuadrado(2);
		double resultadoEsperado = 4;
		Assert.assertEquals(resultadoEsperado,num,0);
	}
	
	@Test
	public void testeCubo() {
		CalculadoraModel calc = new CalculadoraModel();
		double num = calc.getCubo(2);
		double resultadoEsperado = 8;
		Assert.assertEquals(resultadoEsperado,num,0);
	}
	
	@Test
	public void testeRaiz() {
		CalculadoraModel calc = new CalculadoraModel();
		double num = calc.getRaizQuadrada(4);
		double resultadoEsperado = 2;
		Assert.assertEquals(resultadoEsperado,num,0);
	}
	
	
	
}
