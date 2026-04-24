package multiThreading.methodesToStopExecution.yeildMethod;


class ThreadD extends Thread{
    public void run(){
        for(int i = 0; i<10;i++){

//            Thread.yield();
            System.out.println("child thread...");
        }
    }

}
public class ThreadYieldExample {
    public static void main(String[] args) {

        ThreadD obj = new ThreadD();

        obj.start();

        for(int i= 0; i<10;i++){
            Thread.yield();      //causes to pause current thread and giving chance other waiting thread same priority
            System.out.println("main thread...");
        }

    }
}
