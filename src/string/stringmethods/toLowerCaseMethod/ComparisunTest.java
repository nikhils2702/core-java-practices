package string.stringmethods.toLowerCaseMethod;

public class ComparisunTest {
    public static void main(String[] args) {
        String s  = "java";

        String s2 = s.toString();

        System.out.println(s==s2);

        String s3 = s.toLowerCase();

        String s4 = s.toUpperCase();

        String s5 = s4.toLowerCase();
    }
}
