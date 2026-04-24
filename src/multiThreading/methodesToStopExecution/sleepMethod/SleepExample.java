package multiThreading.methodesToStopExecution.sleepMethod;

public class SleepExample {
    public static void main(String[] args)throws InterruptedException {

        for(int i = 0; i<10;i++){
            Thread.sleep(2000);
            System.out.println(i);
        }
    }
}
