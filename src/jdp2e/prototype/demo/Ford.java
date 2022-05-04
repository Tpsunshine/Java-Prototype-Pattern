package jdp2e.prototype.demo;

public class Ford extends BasicCar
{
	//A base price for Ford
	public int basePrice = 100000;
	public Ford(String f)
	{
		modelName = f;
	}
	
	@Override
	public BasicCar clone() throws CloneNotSupportedException
	{
		return (Ford)super.clone();
	}

}
