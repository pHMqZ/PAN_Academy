package parte2;

import java.util.Locale;
import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Name: ");
		String name = sc.nextLine();

		System.out.println("Price: ");
		Double price = sc.nextDouble();

		System.out.println("Quantidade em estoque: ");
		int quantity = sc.nextInt();
		
		if (sc.hasNextInt()) {
			Product2 product = new Product2(name, price, quantity);
			System.out.println();
			System.out.println("Product data: " + product);
		} else {
			Product2 product = new Product2(name, price, quantity);
			System.out.println();
			System.out.println("Product data: " + product);
		}

		sc.close();
	}

}
