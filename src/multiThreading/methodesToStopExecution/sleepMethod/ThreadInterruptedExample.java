package multiThreading.methodesToStopExecution.sleepMethod;


class ThreadExample extends Thread{

    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("slow go Thread" + i);
                Thread.sleep(2000);
            }
        }
            catch(InterruptedException e){
                System.out.println("i am interrup");
            }
    }
}
public class ThreadInterraptedExample {
    public static void main(String[] args) {

    }
}
