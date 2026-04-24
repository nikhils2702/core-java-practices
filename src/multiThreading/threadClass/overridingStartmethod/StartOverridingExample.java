package multiThreading.threadClass.overridingStartmethod;

class ThreadExample extends Thread{

    public void start(){
        System.out.println("start method execute..");
    }
    public void run(){
        System.out.println("main method executed..");
    }
}
public class StartOverridingExample {

    public static void main(String[] args) {

        ThreadExample obj = new ThreadExample();

        obj.start();

        System.out.println("main method executed..");
    }
}
