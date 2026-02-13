package function;

import java.util.Scanner;

public class FunctionImp2 {
	public static boolean isPrime(int number)
	{
		if(number<=1) return false;
			
		
		for(int i=2;i<=number-1;i++)
		{
			if(number %i==0) return false;
		}
		return true;
	}
	public static void generatePrimeNumberSeries()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check the prime number series");
		int n=sc.nextInt();
		if(n<=1)
		{
			System.out.println(" please enter a positive number");
			return;
		}
		for(int i=2;i<n;i++)
		{
			if(isPrime(i)) System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		generatePrimeNumberSeries();
	}

}