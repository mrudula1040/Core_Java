package if_else;


import java.util.Scanner;

public class if7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);
		if(ch>='0' && ch<='9')
		{
			System.out.println("Character "+ ch +" is a number");
		}
		else if(ch>='A'&& ch<='Z')
		{
			System.out.println("Character "+ ch +" is a Uppercase");

		}
		else if(ch>='a'&& ch<='z')
		{
			System.out.println("Character "+ ch +" is a Lowercase");

		}else {
			System.out.println("Character "+ ch+" is a special Character");

		}
	}
}
