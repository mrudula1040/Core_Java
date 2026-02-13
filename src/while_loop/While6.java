package while_loop;
import java.util.Scanner;

public class While6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=n;
		int lastDigit,result=0;
		while(i!=0)
		{
			lastDigit=i%10;
			result=result*10+lastDigit;
			i/=10;
			
		}
		System.out.println("Reverse Order = "+ result);
	}

}