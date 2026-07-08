import java.util.Scanner;
class trydemo
{
    String name;
    int age;
    trydemo()
    {
        name = "JAY";
        age = 22;
    }
    trydemo(String name, int age)
    {
        this.name = name;
        this.age = 22;
    }
	trydemo(trydemo h)
	{
			name= h.name;
			age=h.age;
	}
}
class COPY_CON
{
     public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.next();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        trydemo obj1 = new trydemo();
        System.out.println("Default name: " + obj1.name + " Age: " + obj1.age);

        trydemo obj3 = new trydemo(name, age);
        System.out.println("User name: " + obj3.name + " Age: " + obj3.age);
		
		trydemo obj4 = new trydemo(obj3);
		System.out.println("Copied name: " + obj4.name + " Age: " + obj4.age);
    }
}