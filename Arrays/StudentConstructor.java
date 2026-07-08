import java.util.*;

//COnstructor Demo
class Student   
{
    String name;
    int age;

    //default constructor
    Student()
    {
        name = "SpongeBob";
        age = 19;
    }

    //parameterized constructor
    //One parameter constructor
    Student(String name)
    {
        this.name = name;
        age = 19;
    }

    // Two parameters constructor
    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

}

class StudentConstructor
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.next();

        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        Student sobj1 = new Student();
        System.out.println("Default name is "+sobj1.name+"\tDefault Age is "+sobj1.age);
    
        Student sobj2 = new Student(name);
        System.out.println("Para name is "+sobj2.name+"\t Age is "+sobj2.age);

        Student sobj3 = new Student(name,age);
        System.out.println("Two para name is "+sobj3.name+"\t Age is "+sobj3.age);

    }
}

