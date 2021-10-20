package br.com.pacote;

import java.lang.reflect.Method;

public class Programa {
	 public static void main(String[] args) {
		 try
		 {
			 //Chama a classe e coloca ela no objetinho (objeto)
			 Object objetinho = Class.forName("br.com.pacote.Pessoa").newInstance();
			 //Chama o método e coloca ele no metodinho(método)
			 Method metodinho = objetinho.getClass().getDeclaredMethod("pegarNome", String.class);
			 //metodinho pode ser visto
			 metodinho.setAccessible(true);
			 
			 //invoca
			 String nome = (String) metodinho.invoke(objetinho,"");
			 	System.out.println(nome);
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	 }

}
