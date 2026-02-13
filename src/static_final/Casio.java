package static_final;

import java.util.Scanner;

public class Casio extends Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter number 2: ");
		int n2 = sc.nextInt();

		System.out.println("Select\n1. Addition\n2. Substraction\n3. Multiplication\n4. Division");
		int choice = sc.nextInt();
//		switch (choice) {
//		case 1:
//			Casio.addition(n1, n2);
//			break;
//		case 2:
//			Casio.substraction(n1, n2);
//			break;
//		case 3:
//			Casio.multiplication(n1, n2);
//			break;
//		case 4:
//			Casio.divison(n1, n2);
//			break;
//		default:
//			System.out.println("Invalid choice");
//		}

		char operator = '0';

		switch (choice) {
		case 1:
			operator = '+';
			break;

		case 2:
			operator = '-';
			break;
		case 3:
			operator = '*';
			break;
		case 4:
			operator = '/';
			break;
		}
	}

}