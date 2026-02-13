package for_loop;
import java.util.Scanner;

public class For5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println("Series of prime number till "+n);
		for(int i=2;i<=n;i++)
		{
			int isPrime=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					isPrime=1;
					break;
				}
			}
			if(isPrime==0) {
				System.out.print(i+" ");
			}
			
		}
	
	}
}