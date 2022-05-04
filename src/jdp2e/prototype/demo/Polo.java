package jdp2e.prototype.demo;

public class Polo extends BasicCar
{
	//A price for Polo
	public int basePrice = 100000;
	public Polo(String p)
	{
		modelName = p;
	}
	
	@Override
	public BasicCar clone() throws CloneNotSupportedException
	{
		return (Polo)super.clone();
		//return this.clone()
	}

}
