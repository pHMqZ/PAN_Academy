package com.microtabela.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microtabela.model.TabelaModel;
import com.microtabela.repository.TabelaRepository;

@RestController
@RequestMapping(value ="/tabela")
public class TabelaResourse {
	
	
	
	@Autowired
	private TabelaRepository repository;
	
	
	@GetMapping
	public ResponseEntity <List<TabelaModel>> findAll(){
		List<TabelaModel> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<TabelaModel> findById(@PathVariable Long id){
		TabelaModel obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);

}
}