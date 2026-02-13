package multilevel;

public class MainClass1 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.bark();
		dog.eat();
		dog.walk();
		
		Puppy puppy=new Puppy();
		puppy.weep();
		puppy.bark();
		puppy.eat();
		puppy.walk();
	}
}