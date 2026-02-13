package vehical.derived;

import vehical.base.Vehical;

public class Car extends Vehical {
	private int seatingCapacity;

	public Car(String brand, String model, double price,int seatingCapacity) {
		super(brand, model, price);
		this.seatingCapacity=seatingCapacity;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public String toString() {
		return super.toString()+"Car [seatingCapacity=" + seatingCapacity + "]";
	}
	
	
	

}