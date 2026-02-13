package if_else;

import java.util.Scanner;

public class if2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		if(num%3==0 && num%5==0)
		{
			System.out.println("Number "+num+" is divisible by 3 and 5 both");
		}else {
			System.out.println("Number "+num+" is not divisible by 3 and 5 both");

		}
	}
}
