package function;

import java.util.Scanner;

public class FunctionImp1 {
	public static boolean isPrime(int number)
	{
		if(number<=1)
		{
			System.out.println("To check the prime number Enter a positive number");
			return false;
			
		}
		for(int i=2;i<=number-1;i++)
		{
			if(number%i==0) return false;
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
			if(isPrime(n))
			{
				System.out.println("Number "+n+" is a prime number");
			}else {
				System.out.println("Number "+n+" is a not prime number");

			}
		
	}
}