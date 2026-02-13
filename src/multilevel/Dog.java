package multilevel;

public class Dog extends Animal{
	public Dog()
	{
		System.out.println("Dog object created");
	}
	public void bark()
	{
		System.out.println("Dog is barking");
	}
	@Override
	public void eat()
	{
		System.out.println("Dog is eating");
	}
	
	@Override
	public void walk()
	{
		System.out.println("Dog is waliking");
	}

}