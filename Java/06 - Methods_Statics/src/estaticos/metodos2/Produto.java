package estaticos.metodos2;

public class Produto {
	
	
	//nao precisa inicializar; Não precisa instanciar
	//Quando usar
	public static int resultado (int arroz, int feijao) {
		return (arroz + feijao);
	}
	
	//Tem que tornar statico para nao instanciar
	public String mudeNomeProduto(String nomeProd) {
		return (nomeProd);
	}
	
	//tratado
	public static String pegarCpf(String cpf) {
		String tratei = cpf.strip();
		return tratei;
	}
}
