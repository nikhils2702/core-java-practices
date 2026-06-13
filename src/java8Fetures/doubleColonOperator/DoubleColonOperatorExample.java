package java8Fetures.doubleColonOperator;

//class Test{
//
//    public static void methodOne(){
//        for(int i = 0; i < 0; i++){
//            System.out.println("Child thread");
//        }
//    }
//}

public class DoubleColonOperatorExample {

    public static void methodOne(){
        for(int i = 0; i < 10; i++){
            System.out.println("Child thread");
        }
    }
    public static void main(String[] args) {
       Runnable r = DoubleColonOperatorExample :: methodOne;

       Thread t = new Thread(r);
       t.start();

       for(int i = 0; i< 10; i++){
           System.out.println("main thrad");
       }
    }
}
