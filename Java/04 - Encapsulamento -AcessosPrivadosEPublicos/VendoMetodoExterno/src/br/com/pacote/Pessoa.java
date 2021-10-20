package br.com.pacote;

public class Pessoa {
	
	//cria a variavel nome
	private String name = "Phillip";
	
	// metodo pegar nome passa parâmetro interno
	private String pegarNome(String visitanteNome) {
		System.out.println("Quem é??.. "+visitanteNome);
		return name;
	}
}
