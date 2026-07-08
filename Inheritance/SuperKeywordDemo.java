class Vehicle
{
    Vehicle(String brand)
    {
		this.brand=brand;
	   System.out.println("Vehicle Brand: " + brand);
    }
}

class Car extends Vehicle
{
    Car(String brand, String model)
    {
        super(brand);   
        this.model=model;
		System.out.println("Car Model: " + model);
    }
}
class SuperKeywordDemo
{
    public static void main(String args[])
    {
        Car c = new Car("Toyota", "Fortuner");
    }
}
