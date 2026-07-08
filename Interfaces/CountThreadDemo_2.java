import java.util.*;

class CountThread implements Runnable 
{
    public void run() 
    {
        try
        {
            int cnt = 1;
            while(true)
            {
                System.out.println("\t\tCount: "+cnt++);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e) 
        {
            System.out.println(e);
        }
    }
}

class DateThread implements Runnable 
{
    public void run() 
    {
        try
        {
            while(true) 
            {
                //Date object In while loop because it will give the current/updated date and time(with seconds) in every loop,
                // if date writeen outside the while loop then  it will not give updated/current date & time.
                Date d = new Date();
                System.out.println("\t\tDate: "+d);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) 
        {
            System.out.println(e);
        }
    }
}

class CountThreadDemo
{
    public static void main(String[] args) {

        CountThread ct = new CountThread();
        DateThread dt = new DateThread();

        // Thread t1 = new Thread(ct); // pass runnable
        // Thread t2 = new Thread(dt);
        //OR
        //Directly passing ibject creation⬇️

        Thread t1 = new Thread(new CountThread());
        Thread t2 = new Thread(new DateThread());

        t1.start();
        t2.start();
    }
}