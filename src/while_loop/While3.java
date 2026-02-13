package while_loop;
import java.util.Scanner;

//factorial of n
public class While3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = n;
		int fact = 1;
		while (i >= 1) {
			fact = fact * i;
			i--;
		}
		System.out.println("Factorail of " + n + " is = " + fact);

	}

}