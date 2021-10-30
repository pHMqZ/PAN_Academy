package com.overrider.demo.copy;

public class Carro extends Veiculo {
	
	//paramos de sobrescrever
//	public void iniciar() {
//		System.out.println("Ligando carro");
//	}
	
	//Se deixar estes dois metodos, ele escolhe o iniciar
	public void iniciarCaminho() {
		System.out.println("Ligando o carro");
	}
	public void frear() {
		System.out.println("Freiando carro");
	}
	

}
