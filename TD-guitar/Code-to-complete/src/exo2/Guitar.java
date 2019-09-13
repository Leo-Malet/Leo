package exo2;


public class Guitar {
	
	private String serialNumber;


	private double price;
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;

	public Guitar(String serialNumber, double price,Builder fender, String model, Type electric, Wood alder, Wood alder2) {
		this.serialNumber=serialNumber;
		this.price=price;
		this.builder=fender;
		this.model=model;
		this.type=electric;
		this.backWood=alder;
		this.topWood=alder2;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	

	public String getModel() {
		return model;
	}

	


	public Builder getBuilder() {
	return builder;
}

public Type getType() {
	return type;
}

public Wood getBackWood() {
	return backWood;
}

public Wood getTopWood() {
	return topWood;
}

	public void setPrice(double price) {
		this.price = price;
	}
 
	public boolean equals (Object arg0) {
		boolean equals = false;
	if(arg0 instanceof Guitar) {
		Guitar currentGuitar = (Guitar) arg0;
		equals = currentGuitar.getBackWood().equals(this.getBackWood()) &&
				 currentGuitar.getBuilder().equals(this.getBuilder()) &&
				 currentGuitar.getTopWood().equals(this.getTopWood()) &&
				 currentGuitar.getModel().equals(this.getModel());
	}
	return equals;
	}
}
