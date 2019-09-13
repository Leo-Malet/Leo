package exo1;

import exo2.Builder;
import exo2.Type;
import exo2.Wood;

public class Guitar {
	
	private String serialNumber;


	private double price;
	private String builder;
	private String model;
	private String type;
	private String backWood;
	private String topWood;

	public Guitar(String serialNumber, double price,String builder, String model, String type, String backWood, String topWood) {
		this.serialNumber=serialNumber;
		this.price=price;
		this.builder=builder;
		this.model=model;
		this.type=type;
		this.backWood=backWood;
		this.topWood=topWood;
	}
	public Guitar(String serialNumber2, int price2, Builder fender, String model2, Type electric, Wood alder,
			Wood alder2) {
		// TODO Auto-generated constructor stub
	}
	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public String getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public String getType() {
		return type;
	}

	public String getBackWood() {
		return backWood;
	}

	public String getTopWood() {
		return topWood;
	}
	public void setPrice(double price) {
		this.price = price;
	}
 
	public boolean equals (Object arg0) {
		boolean equals = false;
	if(arg0 instanceof Guitar) {
		Guitar currentGuitar = (Guitar) arg0;
		equals = currentGuitar.getBackWood().equals(this.getBackWood())&&
				 currentGuitar.getBuilder().equals(this.getBuilder())&&
				 currentGuitar.getTopWood().equals(this.getTopWood())&&
				 currentGuitar.getModel().equals(this.getModel());
	}
	return equals;
	}
}
