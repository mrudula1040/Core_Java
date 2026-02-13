package main_class;
public class Person {
	private int age;
	private String name;
	private String gender;
	
   private	boolean active;
	
   public Person() {
	   System.out.println("Default constructor called");
	   name="sprk";
	   age=55;
	   gender="Female";
	   active=false;
}
   Person(String name,int age,String gender,boolean active)
   {
	   this.name=name;
	   this.age=age;
	   this.gender=gender;
	   this.active=active;
   }
   

   public void setName(String name)
   {
	   this.name=name;
   }
   public String getName()
   {
	   return name;
   }
   
	public int getAge() {
	return age;
}
   public void setAge(int age) {
	this.age = age;
   }
   public String getGender() {
	return gender;
   }
   public void setGender(String gender) {
	this.gender = gender;
   }
   public boolean isActive() {
	return active;
   }
   public void setActive(boolean active) {
	this.active = active;
   }
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", gender=" + gender + ", active=" + active + "]";
	}

}