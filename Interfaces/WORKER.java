class DemoWorker implements Runnable
{
    public void run()
    {
        String name = Thread.currentThread().getName();

        System.out.println("\t\t" + name + " has started");

        try
        {
            Thread.sleep(2000); // simulate work
        }
        catch (InterruptedException e)
        {
            System.out.println(name + " was interrupted!");
            return;
        }

        System.out.println(name + " has finished");
    }
}

public class WORKER
{
    public static void main(String args[])
    {
        Thread t1 = new Thread(new DemoWorker(), "Worker-1");
        Thread t2 = new Thread(new DemoWorker(), "Worker-2");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("THREAD STARTED");

        t1.start();
        t2.start();

        System.out.println(t1.getName() + " is alive: " + t1.isAlive());

        try
        {
            System.out.println("MAIN THREAD WAITING FOR " + t1.getName() + " TO FINISH");
            t1.join();

            System.out.println("MAIN THREAD IS IMPATIENT INTERRUPTING " + t2.getName());
            t2.interrupt();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("MAIN THREAD EXECUTED");
    }
}