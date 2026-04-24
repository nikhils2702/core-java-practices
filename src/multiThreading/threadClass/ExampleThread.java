package multiThreading.threadClass;

public class ExampleThread extends Thread {
    public void run(){
        for(int i = 0; i<10;i++){
            System.out.println(" child thread...");
        }
    }
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName()); //main

        ExampleThread obj = new ExampleThread();
        obj.run();

        System.out.println(obj.getName());

        Thread.currentThread().setName("Nikhil");

        System.out.println(Thread.currentThread().getName());

        int noOfCours = Runtime.getRuntime().availableProcessors();

        System.out.println(noOfCours);

    }


}
