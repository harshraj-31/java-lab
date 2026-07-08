

class KitchenTask implements Runnable 
{

    private String taskName;
    private int timeNeeded; // in seconds

    KitchenTask(String name, int time) 
    {
        this.taskName = name;
        this.timeNeeded = time;
    }

    @Override
    public void run()
    {
        System.out.println("\t\tStarted: "+taskName);

        try
        {
            //Simulate the time it takes to do the task
            for(int i=1;i<=timeNeeded;i++)
            {
                Thread.sleep(1000); //1 sec sleep/pause  per step
                System.out.println("["+taskName+"] is "+(i*100/timeNeeded)+"% done....");
            }
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println("\t\tFinished: "+taskName);
    } 
}

public class KitchenDemo
{
    public static void main(String[] args) 
    {
        System.out.println("----CHEF STARTS THE MEAL----");

        //Creating the tasks
        Thread pasta = new Thread(new KitchenTask("Boiling Pasta",5));
        Thread sauce = new Thread(new KitchenTask("Simmering sauce",4));
        Thread salad = new Thread(new KitchenTask("Chopping Salad",3));

        //Starting all the tasks simultaneously
        pasta.start();
        sauce.start();
        salad.start();

        System.out.println("----CHEF IS MONITORING ALL PROCESS----");
    }
}
