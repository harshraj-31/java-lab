import java.util.*;

class chatSender implements Runnable {
    private Scanner scanner;
    private String username;

    public chatSender(String username, Scanner scanner) {
        this.username = username;
        this.scanner = scanner;
    }

    public void run() {
        while (true) {
            synchronized (scanner) {
                System.out.print(username + " (send): ");
                String message = scanner.nextLine();

                if (message.equalsIgnoreCase("bye")) {
                    System.out.println(username + " has left the chat");
                    System.exit(0);
                }
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(username + " was interrupted");
            }
        }
    }
}


// Receiver class (you forgot this)
class chatReceiver implements Runnable {
    private Scanner scanner;
    private String username;

    public chatReceiver(String username, Scanner scanner) {
        this.username = username;
        this.scanner = scanner;
    }

    public void run() {
        while (true) {
            synchronized (scanner) {
                System.out.print(username + " (receive): ");
                String message = scanner.nextLine();

                if (message.equalsIgnoreCase("bye")) {
                    System.out.println(username + " has left the chat");
                    System.exit(0);
                }
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(username + " was interrupted");
            }
        }
    }
}


// Main class
class CHAT_THREAD {
    public static void main(String args[]) {
        System.out.println("Two way chat start");

        Scanner scanner = new Scanner(System.in);

        Thread sender = new Thread(new chatSender("Yashvi", scanner));
        Thread receiver = new Thread(new chatReceiver("Hetvi", scanner));

        sender.start();
        receiver.start();
    }
}