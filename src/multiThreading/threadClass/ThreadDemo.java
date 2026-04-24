package multiThreading.threadClass;

public class ThreadDemo {

    public static void main(String[] args) {

        ExampleThread obj1 = new ExampleThread();

        obj1.start();

        for(int i = 0; i < 10;i++){
            System.out.println(" main thread...");
        }
    }
}
