// method overriding  or RUNTIME POLYMORPHISM

class Animal
{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal
{
    void sound()
    {
        System.out.println("Cat meows");
    }
}

public class Mix
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.sound();

         Cat c = new Cat();
        c.sound();
    }

}