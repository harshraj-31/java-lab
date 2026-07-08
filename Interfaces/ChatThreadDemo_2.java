import java.util.*;

class ChatSender implements Runnable
{
    private Scanner scanner; //Scanner Object
    private String userName;

    //Constructor
    public ChatSender(String username, Scanner scanner)
    {
        this.userName = username;
        this.scanner = scanner;
    }

    // Thread/Runnable Main method run()
    public void run()
    {
        while (true)
        {
            synchronized(scanner) // syncronizing input to avoid conflicts
            {
                System.out.println(userName+" (send) : ");
                String message = scanner.nextLine();
                if(message.equalsIgnoreCase("bye"))
                {
                    System.out.println(userName+" has left the chat. ");
                    System.exit(0);
                }
            } // end of synchronized
            try
            {
                Thread.sleep(500); // small delay to simulate real chat

            }catch(InterruptedException e)
            {
                System.err.println(userName+" was Interrupted. ");
            }
        } 
           
    }
    
}

class ChatReceiver implements Runnable
{
    private Scanner scanner; //Scanner Object
    private String userName;

    //Constructor
    public ChatReceiver(String username, Scanner scanner)
    {
        this.userName = username;
        this.scanner = scanner;
    }

    // Thread/Runnable Main method run()
    public void run()
    {
        while (true)
        {
            synchronized(scanner) // syncronizing input to avoid conflicts
            {
                System.out.println(userName+" (reply) : ");
                String message = scanner.nextLine();
                if(message.equalsIgnoreCase("bye"))
                {
                    System.out.println(userName+" has left the chat. ");
                    System.exit(0);
                }
            } // end of synchronized
            try
            {
                Thread.sleep(500); // small delay to simulate real chat

            }catch(InterruptedException e)
            {
                System.err.println(userName+" was Interrupted. ");
            }
        } 
           
    }
    
}




class ChatThreadDemo
{
    public static void main(String[] args) 
    {
        System.out.println("Two-way chat Started ! Type 'bye' to stop.");
        Scanner scanner = new Scanner(System.in); // Shared Scanner for both users    
    
        Thread sender = new Thread(new ChatSender("Karan",scanner));
        Thread receiver = new Thread(new ChatReceiver("Anas",scanner));


        sender.start();
        receiver.start();
    }

}