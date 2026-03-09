package string;

public class StringReverce {
    public static void main(String[]args){

        String a ="java";
        String b = "";

        for(int i = 0; i < a.length();i++){

            b= a.charAt(i) + b;

        }
        System.out.println(b);


    }


}
