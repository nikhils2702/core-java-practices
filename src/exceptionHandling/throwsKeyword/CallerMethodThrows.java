package exceptionHandling.throwsKeyword;

public class CallerMethodThrows {

    public static void main(String[] args)throws InterruptedException {

        doStuff();
        System.out.println("hello");
    }
        public static void doStuff()throws InterruptedException{

        doMoreStuff();
        }
        public static void doMoreStuff()throws InterruptedException{
        Thread.sleep(5000);

        }

}
