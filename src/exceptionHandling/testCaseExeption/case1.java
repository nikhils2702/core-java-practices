package exceptionHandling.testCaseExeption;
import java.io.*;

public class case1 {
    public static void main(String[] args) {
        try{
            System.out.println("hello print case 1");
        }
        catch(ArithmeticException e){

        }

        // case 2

        try{
            System.out.println("hallo print case 2");
        }
        catch(Exception e){

        }


        // case 3


//        try{
//            System.out.println("hallo print third case");
//        }
//        catch(IOException){
//
//        }


        //case4

//        try{
//            System.out.println("hallo");
//        }
//        catch(InterruptedException e){
//
//        }

        //case 5

        try{
            System.out.println("hallo print in case 5");
        }
        catch (Error e){

        }



    }
}
