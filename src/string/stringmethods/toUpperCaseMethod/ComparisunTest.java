package string.stringmethods.toUpperCaseMethod;

public class ComparisunTest {

    public static void main(String[] args) {

        String s = new String("durga");

        String s2 = s.toUpperCase();
        String s3 = s.toLowerCase();

        System.out.println(s==s2);
        System.out.println(s==s3);


    }
}
