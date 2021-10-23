package com.microcalculadora.resourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microcalculadora.model.Calculadora;
import com.microcalculadora.service.CalculadoraService;

@RestController
@RequestMapping(value = "/resultado")
public class CalculadoraResourse {
	
	@Autowired
	private CalculadoraService service;
	
	
	@GetMapping(value = "/{tabelaId}/multiplique/{dias}")
	public ResponseEntity<Calculadora> getPayment(@PathVariable Long tabelaId, @PathVariable Integer dias){
		Calculadora calculadora = service.getCalculo(tabelaId, dias);
		return ResponseEntity.ok(calculadora);
	}
	

}
