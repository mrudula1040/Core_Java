package for_loop;

import java.util.Scanner;

public class For1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int cube=i*i*i;
			System.out.println("The cube of "+i+" = "+cube);
		}

	}
}