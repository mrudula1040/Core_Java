package function;

import java.util.Scanner;

public class Function1 {
	public static void addition()
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int result=n1+n2;
		System.out.println("Addition of "+n1+" , "+n2+" = "+result);
		
	}
	public static void substraction(int a,int b)
	{
		int result=a-b;
		System.out.println("Substraction of "+a+" , "+b+" = "+result);

	}
	
	public static void main(String[] args) {
		addition();
		substraction(50, 10);
	}

	
}