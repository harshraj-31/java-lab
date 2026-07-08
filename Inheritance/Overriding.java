class Vehicle
{
		void Fuletype()
		{
			System.out.println("Vehicles can use different types of fuel");
		}
}
class Car extends Vehicle
{
		void Fuletype()
		{
			System.out.println("Cars use petrol or diesel");
		}

}

class Overriding
{
public static void main(String args[])
{
	Vehicle v =new Vehicle();
	v.Fuletype();
	
	Car c = new Car();
	c.Fuletype();
}
}