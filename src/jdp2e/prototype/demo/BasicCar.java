package jdp2e.prototype.demo;

import java.util.Random;

public abstract class BasicCar implements Cloneable

{
	public String modelName;
	public int basePrice, onRoadPrice;
	
	public String getModelName()
	{
		return modelName;
	}
	public void setModelname(String modelname)
	{
		this.modelName = modelname;
	}
	
	public static int setAdditionalPrice()
	{
		int price = 0;
		Random r = new Random();
		//We will get an integer value in the range 0 to 1000000
		int p = r.nextInt(100000);
		price = p;
		return price;
	}
	public BasicCar cloned() throws CloneNotSupportedException
	{
		return (BasicCar)super.clone();
	}

}
