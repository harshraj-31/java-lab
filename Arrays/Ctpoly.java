//COMPILE TIME POLYMORPHISM - method overloading

class Student
{
    String name;
    int age;

    public void printInfo(String name)
    {
        System.out.println("Name is :"+name);
    }

    public void printInfo(int age)
    {
        System.out.println("Age is :"+age);
    }

    public void printInfo(String name, int age)
    {
        System.out.println("Name is :"+name+" and Age is :"+age);
    }
}

class Ctpoly
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name = "James Bond";
        s1.age = 56;

    //calling method with same name just different parameters
       s1.printInfo(s1.name);
       s1.printInfo(s1.age); 
       s1.printInfo(s1.name, s1.age);

    }
}
