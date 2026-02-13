package while_loop;
import java.util.Scanner;

public class While5 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=n;
		int sum=0,lastDigit;
		while(i!=0)
		{
			lastDigit=i%10;
			sum=sum+lastDigit;
			i/=10;
		}
		System.out.println("The sum of digit "+n +" = "+ sum);
	}

}