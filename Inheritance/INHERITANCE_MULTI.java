import java.util.*;

class Vehicle
{
    String brand;
    int year;

    public void displayvehicle()
    {
        System.out.println("Brand Name => " + brand);
        System.out.println("Year => " + year);
    }
}

class Car extends Vehicle
{
    String model;

    public void displaycar()
    {
        displayvehicle();
        System.out.println("Model => "+ model);
    }
}


class ElectricCar extends Car
{
    int betcap;
	public void bet()
	{
		displaycar();
		System.out.println("betcap"+betcap);
	}
}


public class INHERITANCE_MULTI
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ElectricCar obj = new ElectricCar();

        System.out.print("ENTER THE BRAND NAME => ");
        obj.brand = sc.next();

        System.out.print("ENTER THE YEAR => ");
        obj.year = sc.nextInt();

        System.out.print("ENTER THE MODEL NAME => ");
        obj.model = sc.next();

		System.out.print("ENTER THE BATTRY CAPACITY => ");
        obj.betcap = sc.nextInt();

        obj.bet();
    }
}
