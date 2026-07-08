import java.util.*;

class Vehicle
{
    String brand;
    int year;

    public void displayVehicle()
    {
        System.out.println("BRAND NAME => " + brand);
        System.out.println("BRAND YEAR => " + year);
    }
}

class Car extends Vehicle
{
    String model;

    public void displayCar()
    {
        displayVehicle();
        System.out.println("CAR MODEL => " + model);
    }
}

class Bike extends Vehicle
{
    String bikename;

    public void displayBike()
    {
        displayVehicle();
        System.out.println("BIKE NAME => " + bikename);
    }
}

public class INHERITANCE_HAIRA
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Car cobj = new Car();
        Bike bobj = new Bike();

        // Car input
        System.out.print("ENTER THE BRAND NAME => ");
        cobj.brand = sc.next();

        System.out.print("ENTER THE YEAR => ");
        cobj.year = sc.nextInt();

        System.out.print("ENTER THE CAR MODEL => ");
        cobj.model = sc.next();

        // Bike input
        System.out.print("ENTER THE BIKE BRAND => ");
        bobj.brand = sc.next();

        System.out.print("ENTER THE BIKE YEAR => ");
        bobj.year = sc.nextInt();

        System.out.print("ENTER THE BIKE NAME => ");
        bobj.bikename = sc.next();

        // Display
        cobj.displayCar();

        bobj.displayBike();
    }
}
