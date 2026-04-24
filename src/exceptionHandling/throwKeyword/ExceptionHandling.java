package exceptionHandling.throwKeyword;

import java.io.IOException;

public class ExceptionHandling {

    void method3()throws IOException {  //method 3 calling method 2

        throw new IOException("device error");

    }
    void method2()throws IOException{   // method2 calling method1
        method3();
    }

    void method1(){
        try {
            method2();
        }catch(IOException exp){

            System.out.println("exception Handled");
        }
    }

    public static void main(String[] args) {
        ExceptionHandling obj = new ExceptionHandling();

        obj.method1();

        System.out.println("normal flow...");
    }
}
