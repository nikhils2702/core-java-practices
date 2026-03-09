package string.stringmethods;

public class charAtMethod {

    public static void main(String[]args){
        String a ="JavaPrograming";

        System.out.println(a.charAt(2));  //v
        System.out.println(a.charAt(9));  //a
        System.out.println(a.charAt(20));  //.StringIndexOutOfBoundsException

    }
}
