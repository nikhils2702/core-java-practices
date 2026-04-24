package multiThreading.threadClass;

public class ExamoleThread extends Thread {
    public void run(){
        for(int i = 0; i<10;i++){
            System.out.println(" child thread...");
        }
    }
    public static void main(String[] args) {
        ExamoleThread obj = new ExamoleThread();
        obj.run();

    }


}
