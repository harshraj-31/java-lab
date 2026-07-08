import java.util.Scanner;
class Scantypes
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //For integer input
        System.out.println("this is For integer input:  ");
        int a = sc.nextInt();
        
        //For float input
        System.out.println("This is for float input: ");
        float b = sc.nextFloat();

        //for string input
        System.out.println("This is for String Input: ");
        String name = sc.next();

        // for single character
        System.out.println("This is for single character");
        char ch = (sc.next()).charAt(0);

        System.out.println("Integer: "+a);
        System.out.println("Float: "+b);
        System.out.println("String: "+name);
        System.out.println("Character: "+ch);

    }
}