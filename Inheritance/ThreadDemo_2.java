class ThreadX extends Thread
{
    //Thread main method
    public void run()
    {
        System.out.println("Thread X is running");
        
    }
}

class ThreadY implements  Runnable
{
    //Thread main method
    public void run()
    {
        System.out.println("Thread Y is running");
    }
}
class ThreadDemo
{
    public static void main(String[] args) 
    {
        //created objects of Tread X and Y
        ThreadX tx = new ThreadX();
        
        //👇 [ i ] if used runnable then create object like this  
        // ThreadY ty = new ThreadY();
        // Thread thy = new Thread(ty);
        
        //👇[ ii ]  also This
        Thread thy2 = new Thread(new ThreadY());



       //Start() method starts the thread 
        tx.start();
        thy2.start();


    }
}