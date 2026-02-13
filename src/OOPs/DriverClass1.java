package OOPs;


public class DriverClass1 {
	public static void main(String[] args) {
		Person personObj1=new Person();
		
		personObj1.name="Sahil joshi";
		personObj1.age=30;
		personObj1.gender="Male";
		
		Person personObj2=new Person();
		personObj2.name="Demo 1";
		personObj2.age=50;
		personObj2.gender="female";
		
		System.out.println("Person 1 Info");
		System.out.println("Name = "+personObj1.name);
		System.out.println("Age = "+personObj1.age);
		System.out.println("Gender = "+personObj1.gender);
		
		System.out.println("------------------------------------------------");
		System.out.println("Person 2 Info");
		System.out.println("Name = "+personObj2.name);
		System.out.println("Age = "+personObj2.age);
		System.out.println("Gender = "+personObj2.gender);
		
	}
}