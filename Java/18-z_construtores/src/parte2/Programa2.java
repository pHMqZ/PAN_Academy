package parte2;

import java.util.Locale;
import java.util.Scanner;

import parte1.Product;

public class Programa2 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//APENAS OBSERVAR
		Product2 product2 = new Product2();
		
		System.out.println("Name: ");
		product2.name = sc.nextLine();
		
		System.out.println("Price: ");
		product2.price = sc.nextDouble();
		
		System.out.println("Quantidade em estoque: ");
		product2.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product2);
	
	
		sc.close();
	}

}
