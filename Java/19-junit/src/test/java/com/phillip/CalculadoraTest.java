package com.phillip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	@Test
	public void testSomar() {
		System.out.println("somar");
		int n1 = 5;
		int n2 = 5;
		Calculadora calculadorazinhaTeste = new Calculadora();
		double resultadoEsperado = 10.0;
		double result = calculadorazinhaTeste.aumentar(n1, n2);
		assertEquals(resultadoEsperado, result, 0);
	}
	
	@Test
	public void testDiminuir() {
		System.out.println("subtrair");
		int n1 = 5;
		int n2 = 3;
		Calculadora calculadorazinhaTeste = new Calculadora();
		double resultadoEsperado = 2;
		double result = calculadorazinhaTeste.diminuir(n1, n2);
		assertEquals(resultadoEsperado, result, 0);
	}
	//Teste para dar erro
	@Test
	public void testQuadrado() {
		System.out.println("Quadrado");
		int n1 = 5;
		Calculadora calculadorazinhaTeste = new Calculadora();
		double resultadoEsperado = 15;
		double result = calculadorazinhaTeste.quadrado(n1);
		assertEquals(resultadoEsperado,result,"erroQuadrado");
	}
}
