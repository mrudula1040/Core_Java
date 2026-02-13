package derived.main;

import derived.derived.Student;

public class MainClass {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setAge(20);
		s1.setGender("male");
		s1.setName("sahil");
		s1.setPercentage(85.55);
		s1.setRollNo(10);
		System.out.println(s1);
		Student s2=new Student(22, 1, "mihir", "male",35.33);
		System.out.println(s2);
	}
}