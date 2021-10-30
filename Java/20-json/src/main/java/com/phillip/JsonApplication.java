package com.phillip;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsonApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(JsonApplication.class, args);
		
		JSONObject jsonzinho = new JSONObject();
		
		jsonzinho.put("Nome","Phillip");
		jsonzinho.put("Sobrenome", "Marques");
		jsonzinho.put("Idade", "26");

		
		System.out.println(jsonzinho);
		
		//writing JSON to file:"JSONExample.json" in cwd
		PrintWriter salvar = new PrintWriter("./src/main/java/testeLeitura.json");
		
		salvar.write(jsonzinho.toJSONString());
		
		salvar.flush();
		salvar.close();
		
	}

}
