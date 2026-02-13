package while_loop;
import java.util.Scanner;

public class While7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int reverse=0,lastDigit;
		int i=n;
		while(i!=0)
		{
			lastDigit=i%10;
			reverse=reverse*10+lastDigit;
			i/=10;
		}
		if(reverse==n)
		{
			System.out.println("Number "+n+" is a palindrome Number");
		}else {
			System.out.println("Number "+n+" is not a palindrome Number");

		}
	}

}