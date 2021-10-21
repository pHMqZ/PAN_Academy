package listas;

import java.util.ArrayList;

public class ArrayFor {
	public static void main(String[] args) {
		ArrayList<String> pessoas = new ArrayList();
		
		
		//List<String> pessoas2 = new ArrayList(); - mais eficiente
		
		
		pessoas.add("Luiza");
		pessoas.add("Phillip");
		pessoas.add("Gabriel");

		System.out.println("-----------------Todas pessoas------------");
		for (String pessoinha : pessoas) {
			System.out.printf("Posição %s\n", pessoinha);

		}

		System.out.println("-----------Começa com P---------");
		for (String pessoinha : pessoas) {
			if (pessoinha.charAt(0) == 'P') {
				System.out.printf("Posição %s\n", pessoinha);

			}
		}

		System.out.println("-----Pessoas e indices----");
		System.out.println("Indo um por um");
		int i = 0;

		for (String pessoinha : pessoas) {
			System.out.printf("Posição %d - %s\n", i, pessoinha);
			i++;
		}

	}

}
