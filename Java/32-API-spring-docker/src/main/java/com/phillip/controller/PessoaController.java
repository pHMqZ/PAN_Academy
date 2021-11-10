package com.phillip.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.phillip.controller.dto.PessoaResponse;
import com.phillip.controller.dto.PessoaRq;
import com.phillip.model.Pessoa;
import com.phillip.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	private final PessoaRepository pessoaRepository;
	
	public PessoaController(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/")
	public List<PessoaResponse> findAll() {
		var pessoas  = pessoaRepository.findAll();
		return pessoas.stream().map(PessoaResponse::converter).collect(Collectors.toList());	
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id}")
	public PessoaResponse findById(@PathVariable("id") Long id) {
		var pessoa = pessoaRepository.getById(id);
		return PessoaResponse.converter(pessoa);
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/")
	public void savePerson(@RequestBody PessoaRq pessoaRq) {
		var p = new Pessoa();
		
		p.setNome(pessoaRq.getNome());
		p.setSobrenome(pessoaRq.getSobrenome());
		
		pessoaRepository.save(p);
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void updatePerson(@PathVariable("id") Long id, @RequestBody PessoaRq pessoaRq) throws Exception{
		var p = pessoaRepository.findById(id);
		
		if(p.isPresent()) {
			var pessoaSave = p.get();
			pessoaSave.setNome(pessoaRq.getNome());
			pessoaSave.setSobrenome(pessoaRq.getSobrenome());
			pessoaRepository.save(pessoaSave);
		} else {
			throw new Exception("Pessoa não encontrada");
		}
	}
}
