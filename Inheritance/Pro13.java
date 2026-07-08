class Vehicle
{
	void start()
	{	
	System.out.println("VEHICLE IS STARTING");
	}
}
class Car extends Vehicle
{
	void start()
	{
	super.start();
	System.out.println("CAR IS STARTING");
	}
	void displaycar()
	{
	System.out.println("THIS IS CAR");
	}
}
class Pro13
{
public static void main(String args[])
	{
		Vehicle v;
		v=new Car();
		v.start();
	
		Car c = new Car();
		c.displaycar();	
	}
} 