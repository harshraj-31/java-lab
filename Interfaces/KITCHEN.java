class KitchenTask implements Runnable 
{
    private String taskname;
    private int timeneeded;

    public KitchenTask(String name, int time)
    {
        this.taskname = name;
        this.timeneeded = time;
    }

		public void run()
		{
			System.out.println("Started: " + taskname);
			try
			{
				for(int i = 1; i <= timeneeded; i++)
				{
					Thread.sleep(1000);
					System.out.println(taskname + " progress: " + i + " sec");
				}
			}
			catch (InterruptedException e)
			{
				System.out.println(taskname + " interrupted");
			}

			System.out.println("Finished: " + taskname);
		}
}

// MAIN CLASS
public class KITCHEN
{
    public static void main(String[] args)
    {
        System.out.println("CHEF STARTS THE MEAL");

        Thread pasta = new Thread(new KitchenTask("BOILING PASTA", 5));
        Thread sauce = new Thread(new KitchenTask("SIMMERING SAUCE", 3));
        Thread salad = new Thread(new KitchenTask("CHOPPING SALAD", 2));

        pasta.start();
        sauce.start();
        salad.start();
    }
}