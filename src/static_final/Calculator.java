package static_final;

public class Calculator {
	public Calculator() {
		System.out.println("Calculator class created");
		
	}
	public static void addition(int n1,int n2) {
		System.out.println("Addition of "+n1+", "+n2+" = "+(n1+n2));
	}
	public static void substraction(int n1,int n2) {
		System.out.println("Substraction of "+n1+", "+n2+" = "+(n1-n2));
	}public static void multiplication(int n1,int n2) {
		System.out.println("Multiplication of "+n1+", "+n2+" = "+(n1*n2));
	}public static void divison(int n1,int n2) {
		if(n2==0)
		{
			System.out.println("Cannot divide by zero");
		}else {
			
			System.out.println("Divison of "+n1+", "+n2+" = "+(n1/n2));
		}
	}
	
	
	public void doCalculate(int n1,int n2,char choice)
	{
		switch (choice) {
		case '+':
			addition(n1, n2);
			break;
		case '-':
			substraction(n1, n2);
			break;
		case '*':
			multiplication(n1, n2);
			break;
		case '/':
			divison(n1, n2);
			break;
		default:
			System.out.println("Invalid choice");
		}
		
	}
//	public static void main(String[] args) {
//		
//	}
}