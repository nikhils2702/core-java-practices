package java8Fetures.functionalInterface.functinolRunnableInterface;

public class Example {

    public static void main(String[] args) {

        Runnable r = () -> {
            for (int i = 0; i <10;i++){
                System.out.println("child Thred");
            }
        };

        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 10; i++){

            System.out.println("main thread");
        }
    }
}
