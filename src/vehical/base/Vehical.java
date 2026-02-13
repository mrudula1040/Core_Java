package vehical.base;

public class Vehical {
	protected String brand;
	protected String model;
	protected double price;
	
	public Vehical(String brand,String model,double price)
	{
		this.brand=brand;
		this.model=model;
		this.price=price;
		
	}
	public void setBrand(String brand)
	
	{
		this.brand=brand;	
	}
	public String getBrand()
	{
		return brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehical [brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	

}