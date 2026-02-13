package while_loop;
import java.util.Scanner;

public class While8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1,sum=0;
		while(i<n)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		
		if(n==sum)
		{
			System.out.println("The number "+n+" is perfect number");
		}else {
			System.out.println("The number "+n+" is not a perfect number, since sum = "+sum);

		}
	}

}