package multiThreading.runnableInterface.OverlodingRunMethod;


class Thread1 extends Thread{
    public void run(){
        System.out.println("no arg child method");
    }
    public void run(int i){
        System.out.println("argument child method");
    }
}

public class OverlodingExample {
    public static void main(String[] args) {
        Thread1 obj =new Thread1();
        obj.start();
    }
}
