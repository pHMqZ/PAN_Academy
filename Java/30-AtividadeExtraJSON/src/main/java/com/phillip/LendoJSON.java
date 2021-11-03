package com.phillip;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LendoJSON {
    public static void main(String[] args) {
        //Cria um objeto JSONParser para ler o arquivo criado na outra classe
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("./src/main/java/employees.json"))
        {
            //Le o arquivo
            Object obj = jsonParser.parse(reader);
 
            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);
             
            //Faz um iterate na array employees para puxar cada value adicionado
            employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
 
    private static void parseEmployeeObject(JSONObject employee) 
    {
        //Pega o objeto employee dentro da lista
        JSONObject employeeObject = (JSONObject) employee.get("employee");
         
        //Pega o primeiro nome do employee e imprimi 
        String firstName = (String) employeeObject.get("firstName");    
        System.out.println(firstName);
         
        //Pega o sobrenome do employee e imprimi
        String lastName = (String) employeeObject.get("lastName");  
        System.out.println(lastName);
         
      //Pega o site do employee e imprimi
        String website = (String) employeeObject.get("website");    
        System.out.println(website);
    }
}

