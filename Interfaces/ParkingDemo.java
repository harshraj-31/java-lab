import java.util.*;

class ParkingFullException extends Exception
{

    public ParkingFullException(String msg) 
    {
        super(msg);
    }
    
}

//Interface
interface ParkingService
{
    public void parkVehicle() throws ParkingFullException;
    public void removeVehicle();
}

//Base Class
class Vehicle
{
    private String vehicleNumber;
    protected String ownerName;

    public String parkingAreaName = "City Parking";

    Vehicle(String vehicleNumber, String ownerName)
    {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    public void displayVehicle()
    {
        System.out.println("Vehicle Number: "+vehicleNumber);
        System.out.println("Vehicle Owner Name: "+ownerName);
        System.out.println("Parking Area Name: "+parkingAreaName);
    }
}
class ParkingLot extends Vehicle implements ParkingService
{
    private int totalSlots = 5;
    private int occupiedSlots = 0;

    ParkingLot(String vehicleNumber, String ownerName)
    {
        super(vehicleNumber,ownerName);
    }

    public void parkVehicle() throws ParkingFullException
    {
        if(occupiedSlots >= totalSlots)
        {
            throw new ParkingFullException("Sorry, You cant park here, All slots are occupied");
        }
        else
        {
            occupiedSlots ++;
            System.out.println("Vehicle Successfully parked");
        }
    }

    public void removeVehicle()
    {
        if(occupiedSlots > 0 )
        {
            occupiedSlots--;
            System.out.println("Vehicle Removed");
        }
        else
        {
            System.out.println("No Vehicles to remove");
        }
    }

    public void display()
    {
        super.displayVehicle();
        System.out.println("Total slots: "+totalSlots);
        System.out.println("Occupied Slots: "+occupiedSlots);
        System.out.println("Remaining Slots"+(totalSlots-occupiedSlots));
    }
}

class ParkingDemo
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Owner Name: ");
        String own = sc.nextLine();

        System.out.println("Enter Vehicle Number: ");
        String vn = sc.nextLine();
        
        ParkingLot pl = new ParkingLot(vn,own);

        int ch;
        do
        {
            System.out.println("1.Park Vehicle");
            System.out.println("2.Remove Vehicle");
            System.out.println("3.Display Parking Status");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:
                try
                {
                    pl.parkVehicle();

                }catch(ParkingFullException e)
                {
                    System.out.println("Error: "+e.getMessage());
                }
                break;

                case 2:
                    pl.removeVehicle();
                    break;
                
                case 3:
                    pl.display();
                    break;

                case 4:
                    System.out.println("Exiting..");
                    break;
                
                default:
                    System.out.println("Invalid choice");
            }
            
        }while(ch!=4);

    }
}