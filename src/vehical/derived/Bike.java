package vehical.derived;

import vehical.base.Vehical;

public class Bike extends Vehical {
	private String engineType;
	
	public Bike(String brand,String model,double price,String engineType)
	{
		super(brand,model,price);
		this.engineType=engineType;
	}
	public void setengineType(String engineType)
	{
		this.engineType=engineType;
	}
	public String getengineType()
	{
		return engineType;
	}
	@Override
	public String toString() {
		return super.toString()+"Bike [engineType=" + engineType + "]";
	}
	
	

}