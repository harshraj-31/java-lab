class Counter {

    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

class MyThread1 extends Thread {

    Counter c;

    MyThread1(Counter c) {
        this.c = c;
    }

    public void run() {
        for(int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

class MyThread2 extends Thread {

    Counter c;

    MyThread2(Counter c) {
        this.c = c;
    }

    public void run() {
        for(int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

class Prac {

    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        MyThread1 t1 = new MyThread1(c);
        MyThread2 t2 = new MyThread2(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + c.count);
    }
}