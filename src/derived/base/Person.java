package derived.base;

public class Person {
	protected int age;
	protected String name;
	protected String gender;
	
	
   public Person() {
	   System.out.println("Default constructor called");
	   
}
   public Person(String name,int age,String gender)
   {
	   System.out.println("Parameterized constructor called");

	   this.name=name;
	   this.age=age;
	   this.gender=gender;
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
  
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}

}