import java.util.*;

// Base class
class Area
{
    protected int length;
    protected int width;

    // Method to input length and width
    public void input_L_W()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = sc.nextInt();

        System.out.print("Enter width: ");
        width = sc.nextInt();
    }
}

class Volume extends Area
{
    private int height;

    public void input_H()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        height = sc.nextInt();
    }

    public void display()
    {
        System.out.println("\nLength  : " + length);
        System.out.println("Width   : " + width);
        System.out.println("Height  : " + height);
        System.out.println("Area    : " + (length * width));
        System.out.println("Volume  : " + (length * width * height));
    }
}

// Main class
public class AREA_OF_VOLUME
{
    public static void main(String[] args)
    {
        Volume v = new Volume();

        v.input_L_W();   // input length & width
        v.input_H();     // input height
        v.display();     // display all values
    }
}