package br.com.pacote;

public class Pessoa {
	
	//cria a variavel nome
	private String name = "Phillip";
	
	// metodo pegar nome passa par�metro interno
	private String pegarNome(String visitanteNome) {
		System.out.println("Quem �??.. "+visitanteNome);
		return name;
	}
}
