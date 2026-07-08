
class Main
{
    String name; //class variable (can access using this keyword)
    int age;

     public void printInfo()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    //Constructor will automatically when class object is called  
    public Main()  // default constructor 
    {
    }

    public Main(String name, int age) { // parameterised constructor
        this.name = name;
        this.age = age;
    }

    public Main(Main m2) // Copy constructor
    {
        this.name = m2.name;
        this.age = m2.age;
    }   

}

class Constructor
{
    public static void main(String[] args) 
    {
        Main m = new Main("Karan",22);
        // m.name = "Karan";
        // m.age = 22;
            
        Main m2 = new Main(m);

        m2.printInfo();
    }
}