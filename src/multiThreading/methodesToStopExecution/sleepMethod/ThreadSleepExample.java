package multiThreading.methodesToStopExecution.sleepMethod;

public class ThreadSleepExample {
    public static void main(String[] args) throws InterruptedException{

        System.out.println("N");
        Thread.sleep(1000);
        System.out.println("i");
        Thread.sleep(2000);
        System.out.println("k");

    }
}
