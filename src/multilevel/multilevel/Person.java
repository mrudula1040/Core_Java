package multilevel.multilevel;

public class Person {
	
	protected int age;
	protected String name;
	protected String gender;
	public Person()
	{
		System.out.println("Person default constructor called");
	}
	public Person(int age, String name, String gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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