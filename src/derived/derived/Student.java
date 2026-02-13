package derived.derived;

import derived.base.Person;

public class Student extends Person{
	private int rollNo;
	private double percentage;
	public Student()
	{
		System.out.println("Default constructor student called");
	}
	public Student(int age,int rollno, String name, String gender, double percentage)
	{
		super(name,age,gender);
		System.out.println("parameterized constructor student called");
		this.rollNo=rollno;
		this.percentage=percentage;
		
		
		

		
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return super.toString()+"Student [rollNo=" + rollNo + ", percentage=" + percentage + "]";
	}
	
	

}