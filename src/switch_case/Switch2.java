package switch_case;


import java.util.Scanner;

public class Switch2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a 2 number");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	System.out.println("Choose operator [+, - ,* ,/]");
	char operator=sc.next().charAt(0);
	int result;
	switch(operator) {
	case '+':
	
		result=n1+n2;
		System.out.printf("Addition of %d , %d = %d",n1,n2,result);
		break;
	
	case '-':
		result=n1-n2;
		System.out.printf("Substraction of %d , %d = %d",n1,n2,result);
		break;
		
	case '*':
		result=n1*n2;
		System.out.printf("Multiplication of %d , %d = %d",n1,n2,result);
		break;
		
	case '/':
		if(n2==0)
		{
			System.out.println("Cannot divide by Zero");
		}else {
			
			result=n1/n2;
			System.out.printf("divide of %d , %d = %d",n1,n2,result);
		}
		break;
	default:
		System.out.println("Invalid operator");
	}
}
}
