//                      DIV A SET 1 question - 1

import java.io.*;
import java.util.*;

class Employee
{
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }   
}

class EmployeeManagement
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    

        //Vector to store employess
        Vector<Employee> v = new Vector<>();

        for(int i=1;i<5;i++)
        {
            System.out.println("Enter ID:");
            int id = sc.nextInt();

            System.out.println("Enter Name:");
            String name = sc.next();

            System.out.println("Enter Salary:");
            double salary = sc.nextDouble();

            v.add(new Employee(id,name,salary));
            System.out.println("Employee added");
        }

        //Writing  in file
        try
        {
            FileOutputStream fos = new FileOutputStream("employees.txt");
            DataOutputStream dos = new DataOutputStream(fos);
        
            //Iterator to traverse vector
            Iterator<Employee> it = v.iterator();

            while(it.hasNext())
            {
                Employee e = it.next();

                //Write data to file
                dos.writeInt(e.id);
                dos.writeUTF(e.name);
                dos.writeDouble(e.salary);

                System.out.println("Data Written in file");
            }
            //Close stream
            dos.close();
            fos.close();

        }catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");
        }
         catch(IOException e)
        {
            System.out.println("IO Error");
        }


        //Reading the file
        try
        {
            FileInputStream fis = new FileInputStream("employees.txt");
            DataInputStream dis = new DataInputStream(fis);

            System.out.println("Employee Details: ");
            for(int i=1; i<5;i++)
            {
                int id = dis.readInt(); //read id
                String name = dis.readUTF(); //read name
                double salary = dis.readDouble(); // read salary

                //Displaying data
                System.out.println(id+" "+name+" "+salary);

            }
            dis.close();
            fis.close();

        }catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");
        }
        catch(IOException e)
        {
            System.out.println("IO Error");
        }
    }
}