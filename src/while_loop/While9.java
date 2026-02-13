package while_loop;
import java.util.Scanner;

public class While9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check the armstrong number or not");
		int n=sc.nextInt();
		int j=n,cube=0;
		while(j!=0)
		{
			int ld=j%10;
			cube=cube+ld*ld*ld;
			j/=10;
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