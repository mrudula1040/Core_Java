package if_else;

import java.util.Scanner;

public class if3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a 2 number");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	System.out.println("Choose operator [+, - ,* ,/]");
	char operator=sc.next().charAt(0);
	int result;
	if(operator=='+')
	{
		result=n1+n2;
		System.out.printf("Addition of %d , %d = %d",n1,n2,result);
	}
	else if(operator=='-'){
		result=n1-n2;
		System.out.printf("Substraction of %d , %d = %d",n1,n2,result);
		
	}
	else if(operator=='*'){
		result=n1*n2;
		System.out.printf("Multiplication of %d , %d = %d",n1,n2,result);
		
	}	else if(operator=='/'){
		if(n2==0)
		{
			System.out.println("Cannot divide by Zero");
		}else {
			
			result=n1/n2;
			System.out.printf("divide of %d , %d = %d",n1,n2,result);
		}
		
	}else {
		System.out.println("Invalid operator");
	}
}
}