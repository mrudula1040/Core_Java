package vehical.main;

import vehical.derived.Bike;
import vehical.derived.Car;

public class MainClass {
	public static void main(String[] args) {
		Car car=new Car("BMW", "M5", 37500000.00, 4);
		Bike bike=new Bike("BMW", "h2", 2500000.00, "V8");
		System.out.println(car);
		System.out.println(bike);
	}

}