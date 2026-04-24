package exceptionHandling.tryWithResource;

import java.io.*;

public class Example {

    public static void main(String[] args) {

        try(BufferedReader obj = new BufferedReader(new FileReader("nikhil.txt"))){

//        } catch (FileNotFoundException e) {
//            System.out.println(".........first");
        } catch (IOException e) {
            System.out.println(".........second catch");
        }
    }
}
