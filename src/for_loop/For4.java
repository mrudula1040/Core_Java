package for_loop;

import java.util.Scanner;

public class For4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int isPrime=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isPrime=1;
			}
			
		}
		if(isPrime==0)
		{
			System.out.println("The Number "+n+ " is prime Number");
		}else {
			System.out.println("The Number "+n+ " is not prime Number");

		}
	}
}