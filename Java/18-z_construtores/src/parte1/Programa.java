package parte1;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Name: ");
		product.name = sc.nextLine();
		
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		
		//E possivel injetar strings, o que causa uma vunerabilidade, problema de segurança. Criando um construtor, torna a application mais segura.
		if(sc.hasNextInt()) {
			System.out.println("Quantidade em estoque: ");
			product.quantity = sc.nextInt();
			System.out.println();
			System.out.println("Product data: " + product);
		} else {
			System.out.println();
			System.out.println("Product data: " + product);
		}
	
	
		sc.close();
	}

}
