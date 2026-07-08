class Shape
{
    public void area()
    {
        System.out.println("Displays Area");
    }
}
class Triangle extends Shape    //Single Level inheritance
{
     public void area(int l, int h)
     {
        System.out.println((0.5)*(l*h));
     }
}

// class EquailateralTriangle extends Triangle  //Multi Level inheritance
// {
//     public void area(int l, int h)
//     {

//     }
// }

class Circle extends Shape   // Heirarchical inheritance (two or more class extends )
{
    public void area(int r)
    {
       System.out.println((3.14)*r*r);
    }
}


public class Inheritance
{
    public static void main(String args[])
    {
        Triangle t = new Triangle();
        t.area(5, 8);
        Circle c = new Circle();
        c.area(3);
    }

}