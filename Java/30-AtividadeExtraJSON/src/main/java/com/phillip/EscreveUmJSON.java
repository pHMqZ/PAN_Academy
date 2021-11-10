package com.phillip;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class EscreveUmJSON {
	
	public static void main(String[] args) {
		// Cria um JSON a partir de um arquivo

		//Primeiro empregado
		JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName", "Alceu");
        employeeDetails.put("lastName", "O Gato ");
        employeeDetails.put("website", "alceuogato.com");
        	
        JSONObject employeeObject = new JSONObject(); 
        employeeObject.put("employee", employeeDetails);

		//Segundo empregado
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Elis");
        employeeDetails2.put("lastName", "Bixiga");
        employeeDetails2.put("website", "elisbixiga.com");
        
        //Terceiro empregado
        JSONObject employeeDetails3 = new JSONObject();
        employeeDetails3.put("firstName", "Banguela");
        employeeDetails3.put("lastName", "O Gato");
        employeeDetails3.put("website", "banguelaogato.com");
         
        JSONObject employeeObject2 = new JSONObject(); 
        employeeObject2.put("employee", employeeDetails2);
        
        JSONObject employeeObject3 = new JSONObject(); 
        employeeObject3.put("employee", employeeDetails3);
        
		//Adiciona os empregados em uma lista
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);
        employeeList.add(employeeObject3);
        
        System.out.println(employeeList);

		// Escreve um arquivo JSON
		try(FileWriter file = new FileWriter("./src/main/java/employees.json")) {
			
			//Pode escrever qualquer instancia JSONArray ou JSONObject no arquivo
			file.write(employeeList.toJSONString()); 
            file.flush();

		}
		catch(IOException e)
		
		{
			e.printStackTrace();
		}

	}

}
