class ThreadX implements Runnable 
{
    public void run() 
    {
        //Use try catch while using .sleep()
        try 
        {
            while(true) 
            {
                System.out.println("Thread X is running");
                
                Thread.sleep(1000); // 1 sec sleep/pause for this current thread
            }
        }catch(InterruptedException e) 
        {
            System.out.println(e);
        }
    }
}

class ThreadY implements Runnable 
{
    public void run() 
    {
        //Use try catch while using .sleep()
        try 
        {
            while(true) 
            {
                System.out.println("Thread Y is running");
                Thread.sleep(500);  // 0.5 sec sleep/pause for this current thread
            }
        } catch(InterruptedException e) 
        {
            System.out.println(e);
        }
    }
}

class ThreadDemo1 
{
    public static void main(String[] args) {

        ThreadX tx = new ThreadX();
        ThreadY ty = new ThreadY();


        // Thread t1 = new Thread(tx); // pass runnable
        // Thread t2 = new Thread(ty);
        //OR
        //Directly passing ibject creation ⬇️
        Thread t1 = new Thread(new ThreadX());
        Thread t2 = new Thread(new ThreadY());


        t1.start();
        t2.start();
    }
}