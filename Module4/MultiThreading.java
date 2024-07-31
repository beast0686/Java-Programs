package Module4;

class MyThreads extends Thread {
    public void run() {
        System.out.println(getName() + " is running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        System.out.println(getName() + " Stopped");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        MyThreads t1 = new MyThreads();
        MyThreads t2 = new MyThreads();

        t1.run();
        t2.run();
    }
}
