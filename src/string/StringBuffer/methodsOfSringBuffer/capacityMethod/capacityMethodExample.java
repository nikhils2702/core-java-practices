package string.StringBuffer.methodsOfSringBuffer.capacityMethod;

public class capacityMethodExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("javaPrograming");

        System.out.println(sb.capacity());

        System.out.println(sb.charAt(5));

        System.out.println(sb.insert(2,'e'));

        System.out.println(sb.delete(0,4));

        System.out.println(sb.deleteCharAt(3));

        System.out.println(sb.reverse());


    }
}
