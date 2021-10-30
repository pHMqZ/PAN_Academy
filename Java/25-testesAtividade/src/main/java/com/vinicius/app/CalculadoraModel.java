package com.vinicius.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class CalculadoraModel {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	
	private double quadrado;
	private double cubo;
	private double raizQuadrada;
	
	
	
	
	
 
	public CalculadoraModel() {}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
 
	public double getQuadrado(double num) {
		quadrado = num * num;
		return quadrado;
	}
 
	public void setQuadrado(double quadrado) {
		this.quadrado = quadrado;
	}
 
	public double getCubo(double num) {
		cubo = num*num*num;
		return cubo;
	}
 
	public void setCubo(double cubo) {
		this.cubo = cubo;
	}
 
	public double getRaizQuadrada(double num) throws IllegalArgumentException{
		if(num < 0) {
			throw new IllegalArgumentException("Não pode tirar raiz de numeros negativos");
		}else {
			raizQuadrada = Math.sqrt(num);
			return raizQuadrada;
		}
		
	}
 
	public void setRaizQuadrada(double raizQuadrada) {
		this.raizQuadrada = raizQuadrada;
	}

	
	

	
}