package if_else;


import java.util.Scanner;

public class if5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if((num>=100 && num<=999) || (num<-100 && num>=-999))
		{
			System.out.println("Number "+num+" Containes 3 digit");
		}else {
			System.out.println("Number "+num+"  is not Containes 3 digit");

		}
	}
}
