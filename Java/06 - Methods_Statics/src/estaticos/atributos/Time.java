package estaticos.atributos;

public class Time {
	
	//muitos atletas
	//pertence ao objeto
	String atleta;
	
	//um professor
	//pertence a classe
	static String professor;
	
	//atributos comuns n�o podem ser acessados por m�todos estaticos
	static void treinar() {
		System.out.println(professor);
		System.out.println(atleta);
	}
}
