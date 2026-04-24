package multiThreading.deadLock;


class First {
    public synchronized void methodOne(Second b) {
        System.out.println("Threadone start execution of methodone");

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){  }
        System.out.println("Threadone typing to call second.last()");
        b.last();

    }

    public synchronized void last(){

        System.out.println("inside a First, this is a last() method");
    }
}

class Second{
    public synchronized void methodSecond(First a){
        System.out.println("ThreadTwo stary execution of SecondMethod");

        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
        }
        System.out.println("ThreadSecond typing to call First.last()");
        a.last();
    }

    public synchronized void last(){

        System.out.println("inside of second, this is a last() method");
    }
}

public class DeadLockExample implements Runnable {

    First obj = new First();

    Second obj2 = new Second();

    DeadLockExample(){
        Thread obj = new Thread(this);
        obj.start();
//        obj.methodOne(obj2);
    }

    public void run(){
//        obj.methodSecond(obj2);
    }
    public static void main(String[] args) {
       new DeadLockExample();

    }
}