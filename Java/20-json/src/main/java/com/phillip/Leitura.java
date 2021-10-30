package com.phillip;

import java.io.FileNotFoundException;

// Java program to read JSON from a file


import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Leitura {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		Object obj = new JSONParser().parse(new FileReader("./src/main/java/testeLeitura.json"));

		JSONObject jsonzinho = (JSONObject) obj;
		
		Iterator<String> iterator = jsonzinho.keySet().iterator();
		
		while (iterator.hasNext()) {
			Object key = iterator.next();
			Object valor = jsonzinho.get(key);
			
			System.out.println("-" + key + ": " + valor);
			
		}
		
//		// get nome
//		String nominho = (String) jsonzinho.get("Nome");
//		String sobrenominho = (String) jsonzinho.get("Sobrenome");
//		long idade = (long) jsonzinho.get("idade"); //Esse get não funciona como long, como String funcionou
//		
//		System.out.println(nominho);
//		System.out.println(sobrenominho);
//		System.out.println(idade);
		
	}
}