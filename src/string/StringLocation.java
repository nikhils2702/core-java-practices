package string;

public class StringLocation {

    public static void main(String[]args) throws InterruptedException{

        String s1 = "Hello";
        String s3 = "nikhil";
        String s2 = new String("nikhil");
        System.out.println(s2);

        Thread.sleep(500000);

        System.out.println("Thread come to end");
        System.out.println(s2);

    }
}
