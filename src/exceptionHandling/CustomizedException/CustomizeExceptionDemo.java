package exceptionHandling.CustomizedException;

class TooYongException extends RuntimeException{
    TooYongException(String s){
        super(s);
    }
}
class TooOldException extends RuntimeException{
    TooOldException(String s){
        super(s);
    }
}
public class CustomizeExceptionDemo{

    public static void main(String[] args) {
        int age = Integer.parseInt(args [70]);

        if (age> 60){
            throw new TooYongException("please get some more time ... u will get best match");
        } else if (age<18) {
            throw new TooOldException("you are age already crossed... no chance of getting married");
        }
        else{
            System.out.println("you will get match details soon by email");
        }
    }
}
