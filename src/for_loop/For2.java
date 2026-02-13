package for_loop;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for fibonacci series: ");
		int n=sc.nextInt();
		int a=0,b=1;
		if(n>0)
		{
			System.out.println("Fibonacci series till "+n);
			if(n>1)
			{
				System.out.print(a+" "+b+" ");
				
			}else {
				System.out.print(a+" ");

				
			}
			
		}else {
			System.out.println("Enter a positive number");
		}
		for(int i=3;i<=n;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;b=c;
		}
		
	}

}