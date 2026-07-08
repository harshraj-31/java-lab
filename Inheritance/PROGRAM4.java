import java.util.Scanner;

// Base Class
class Vehicle {
    String vehicleNumber;
    String model;
    final String companyName = "MotoCorp";

    Vehicle(String vehicleNumber, String model) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
    }

    final void startEngine() {
        System.out.println("Vehicle Company: " + companyName);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Model: " + model);
        System.out.println("Engine Started");
    }
}

// Intermediate Class
class TwoWheeler extends Vehicle {
    String type;

    TwoWheeler(String vehicleNumber, String model, String type) {
        super(vehicleNumber, model);
        this.type = type;
    }
}

// Derived Class
class Bike extends TwoWheeler {
    int fuelCapacity;

    Bike(String vehicleNumber, String model, String type, int fuelCapacity) {
        super(vehicleNumber, model, type);
        this.fuelCapacity = fuelCapacity;
    }

    void calculateMileage() {
        Scanner sc = new Scanner(System.in);

        int mileage;

        if (type.equalsIgnoreCase("Sports")) {
            mileage = 35;
        } else {
            mileage = 50;
        }

        System.out.println("Type: " + type);
        System.out.println("Fuel Capacity: " + fuelCapacity + " L");
        System.out.println("Mileage: " + mileage + " km/l");

        // 🔹 Ask Total KM
        System.out.print("Enter Total KM to travel: ");
        double totalKM = sc.nextDouble();

        double fuelNeeded = totalKM / mileage;

        System.out.println("Fuel Needed: " + fuelNeeded + " L");

        if (fuelNeeded <= fuelCapacity) {
            System.out.println("You have enough fuel.");
        } else {
            System.out.println("Not enough fuel!");
        }
    }
}

// Main Class
class PROGRAM4 {
    public static void main(String args[]) {

        Bike b1 = new Bike("GJ01AB1234", "Shine", "Standard", 10);

        b1.startEngine();
        b1.calculateMileage();
    }
}
