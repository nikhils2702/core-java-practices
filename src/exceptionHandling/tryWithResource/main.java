package exceptionHandling.tryWithResource;


import java.io.BufferedReader;

class ResourceExample implements AutoCloseable{

    @Override
    public void close(){
        System.out.println("resource closed atometically....");

    }
}

public class main {

    public static void main(String[] args) {

        try(ResourceExample obj = new ResourceExample()){
            System.out.println("using the resourse...");
        }
        catch (Exception e){
            System.out.println("............");
        }
    }
}
