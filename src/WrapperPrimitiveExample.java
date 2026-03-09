public class WrapperPrimitiveExample {
    public static void main(String[] args) {
        Character a = 'a';
        Character b = 'a';

        float x = 1000;
        int y = 1000;

        System.out.println(a == b); // false
        System.out.println(x == y); // true
    }
}
