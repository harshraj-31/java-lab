
import java.util.*;

class SharedList {

    ArrayList<String> list = new ArrayList<String>();

    // synchronized method
    synchronized void addItem(String item) 
    {
        list.add(item);
        System.out.println(Thread.currentThread().getName() + " added: " + item);
    }
}

class MyThread extends Thread 
{

    SharedList obj;

    MyThread(SharedList obj) 
    {
        this.obj = obj;
    }

    public void run() 
    {
        for (int i = 1; i <= 3; i++) 
        {
            obj.addItem(getName() + "-Task" + i);
        }
    }
}

public class Ques1 
{

    public static void main(String[] args) throws Exception 
    {

        SharedList obj = new SharedList();

        MyThread t1 = new MyThread(obj);
        MyThread t2 = new MyThread(obj);
        MyThread t3 = new MyThread(obj);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("\nFinal List:");

        Iterator<String> it = obj.list.iterator();
        while (it.hasNext()) 
        {
            System.out.println(it.next());
        }

        System.out.println("Total items: " + obj.list.size());
    }
}
