package entradas;

import java.util.Scanner;

public class LerScanner {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		Scanner myObj2 = new Scanner(System.in);

		System.out.println("Enter username");
		String userName = myObj.nextLine(); // Read user input
		System.out.println("How old are you?");
		int age = myObj2.nextInt();

		System.out.println("Username is: " + userName); // Output user input
		System.out.printf("User age is: %d%n", age);

	}
}
