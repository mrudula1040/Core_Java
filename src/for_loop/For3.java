package for_loop;

import java.util.Scanner;

public class For3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check the armstrong number or not");
		int n=sc.nextInt();
		int j=n,cube=0;
		for(int i=j;i!=0;i/=10)
		{
			int l=i%10;
			cube=cube+l*l*l;
			
		}
		if(n==cube)
		{
			System.out.println("The number "+n+" is armstrong Number, since sum = "+cube);
		}
		else {
			System.out.println("The number "+n+" is not armstrong Number, since sum = "+cube);

		}
		
	}
}