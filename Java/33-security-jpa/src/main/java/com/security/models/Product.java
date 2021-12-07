package com.security.models;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_product")
	private Long id;
	
	private String nome;
	private String marca;
	private String fabricacao;
	private float preco;
	
	public Product() {//construtor vazio para realizar transações
		
	}
	
	public Long getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getFabricacao() {
		return fabricacao;
	}


	public void setFabricacao(String fabricacao) {
		this.fabricacao = fabricacao;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	

}
