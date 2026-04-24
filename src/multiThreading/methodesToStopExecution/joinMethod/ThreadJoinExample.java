package multiThreading.methodesToStopExecution.joinMethod;

class Thread1 extends Thread{

    public void run(){
        for(int i = 0 ; i<10;i++){
            System.out.println("child thread.");

            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){

            }
        }
    }
}
public class ThreadJoinExample {

    public static void main(String[] args)throws InterruptedException {

        Thread1 obj =new Thread1();

        obj.start();

        obj.join();

        for (int i = 0;i<10;i++){
            System.out.println("main thread");
        }
    }
}
