package main_class;

public class MainClass {
	public static void main(String[] args) {
		
		Person p1=new Person();
	System.out.println(p1);
		
		Person p2=new Person("sahil",22,"Male",true);
		System.out.println(p2);
		p1.setName("mihir");
		p1.setGender("male");
		p1.setAge(20);
		p1.setActive(false);
		System.out.println(p1);

		
	}
}