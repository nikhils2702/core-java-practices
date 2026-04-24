package multiThreading.threadClass;


class ThreadTest extends Thread{
    public void run(){
        System.out.println("Child Thread...call ");
    }
}
public class ThreadApproachExample {

    public static void main(String[] args) {

        ThreadTest obj = new ThreadTest();

        Thread obj1 = new Thread(obj);

        obj.start();

        System.out.println("main thread...call");
    }
}
