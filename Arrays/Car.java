import java.util.*;

class Car
{
    String brand,model; // data memeber
    int year;

    void displayDetails(String b,String m,int y)
    {
        brand = b; // assign value to class variable
        model = m;
        year = y;

        System.out.println("\n\tBrand Name => "+brand);
        System.out.println("\n\tModel Name =>"+model);
        System.out.println("\n\tYear =>"+year);
    }

    public static void main(String[] args) 
    {
        Car cobj = new Car(); // craete object of class name cobj;
        //Static value pass
        // cobj.displayDetails("Tarzan", "A1", 1999);     

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\tEnter the brand name: ");
        String b = sc.next();

        System.out.println("\n\tEnter the Model name: ");
        String m = sc.next();

        System.out.println("\n\tEnter the year: ");
        int y = sc.nextInt();

        cobj.displayDetails(b, m, y);
    }
}