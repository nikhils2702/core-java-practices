package multiThreading.runnableInterface.runMethod;

class RunMethod extends Thread{

    public void run(){

        for(int i = 0; i< 10; i++){
            System.out.println("Child thread...");
        }
    }
}

public class RunMethodExample {
    public static void main(String[] args) {
        RunMethod t = new RunMethod();
        t.run();

        for(int i =0; i<10;i++){
            System.out.println("main thread...");
        }
    }
}
