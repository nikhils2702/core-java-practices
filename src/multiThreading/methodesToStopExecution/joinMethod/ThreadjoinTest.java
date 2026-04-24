package multiThreading.methodesToStopExecution.joinMethod;

import java.lang.Thread;
class ThreadExample extends Thread{
    static Thread mt;
    public void run(){
       try{
           mt.join();
       }
       catch(InterruptedException e){

       }

       for(int i = 0; i<10;i++){
           System.out.println("child Thread..");
       }
    }
}
public class ThreadjoinTest {

    public static void main(String[] args)throws InterruptedException{
        ThreadExample.mt =  Thread.currentThread();

        ThreadExample obj1 = new ThreadExample();

        obj1.start();

        for(int i= 0; i<10;i++){
            System.out.println("main Thread");
            Thread.sleep(2000);
        }
    }

}
