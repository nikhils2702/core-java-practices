package java8Fetures.functionalInterface.functinolRunnableInterface;

public class RunnableExample {
    public static void main(String[] args) {

        Runnable r = () -> {
            for(int i = 0; i <10; i++){
                System.out.println("Child Thred");
            }
        };

        Thread t =new Thread(r);
        t.start();
        for(int i = 0; i<10; i++){
            System.out.println("main Thread");
        }
    }
}
