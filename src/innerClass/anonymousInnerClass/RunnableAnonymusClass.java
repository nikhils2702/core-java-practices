package innerClass.anonymousInnerClass;

import java.util.concurrent.RunnableFuture;

public class RunnableAnonymusClass {



    public static void main(String[] args) {

        System.out.println("hello");

        Runnable obj = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    System.out.println(" child Thread...");
                }
            }
        };
        Thread obj1= new Thread(obj);

        obj1.start();

        for(int i = 0; i< 10;i++){
            System.out.println("main thread...");
        }
    }
}
