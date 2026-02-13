package OOPs;

import java.util.Scanner;

public class DriverClass2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Person personObj1=new Person();
		
		System.out.println("Enter Name: ");
		personObj1.name=sc.nextLine();
		System.out.println("Enter age: ");
		personObj1.age=sc.nextInt();
		System.out.println("Enter Gender: ");
		personObj1.gender=sc.next();
		System.out.println("Enter activeness");
		personObj1.active=sc.nextBoolean();
		
		Person personObj2=new Person();
		sc.nextLine();
		System.out.println("Enter Name: ");

		personObj2.name=sc.nextLine();
		System.out.println("Enter age: ");

		personObj2.age=sc.nextInt();
		System.out.println("Enter Gender: ");

		personObj2.gender=sc.next();
		System.out.println("Enter activeness");

		personObj2.active=sc.nextBoolean();
		
		System.out.println("Person 1 Info");
		System.out.println("Name = "+personObj1.name);
		System.out.println("Age = "+personObj1.age);
		System.out.println("Gender = "+personObj1.gender);
		System.out.println("Active = "+personObj1.active);

		
		System.out.println("------------------------------------------------");
		System.out.println("Person 2 Info");
		System.out.println("Name = "+personObj2.name);
		System.out.println("Age = "+personObj2.age);
		System.out.println("Gender = "+personObj2.gender);
		System.out.println("Active = "+personObj2.active);

		
	}
}