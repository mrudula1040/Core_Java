package Basic;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("priya");
		String userName=sc.nextLine();
		System.out.println("hello"+userName);
		sc.close();
	}
	
}
