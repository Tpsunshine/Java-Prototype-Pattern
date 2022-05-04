package jdp2e.prototype.demo;

public class PrototypePatternExample 
{

	public static void main(String[] args) throws CloneNotSupportedException
	{
		System.out.println("***Prototype Pattern Demo***\n");
		Polo polo = new Polo("Blue Polo");
		polo.basePrice = 100000;
		
		Ford ford = new Ford("Black Ford");
		ford.basePrice = 500000;
		
		BasicCar bc1;
		//Polo
		bc1 = polo.clone();
		//Price will be more than 100000 for sure
		bc1.onRoadPrice = polo.basePrice + BasicCar.setAdditionalPrice();
		System.out.println("Car is: "+ bc1.modelName+" and it's price is Rs."+bc1.onRoadPrice);
		
		//Ford
		bc1 = ford.clone();
		//Price will be more than 5000000 for sure
		bc1.onRoadPrice = ford.basePrice + BasicCar.setAdditionalPrice();
		System.out.println("Car is: "+ bc1.modelName+" and it's price is Rs."+bc1.onRoadPrice);
		
		
	}

}
