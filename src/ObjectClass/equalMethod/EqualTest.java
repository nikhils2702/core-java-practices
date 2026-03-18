package ObjectClass.equalMethod;

public class EqualTest {

    public static void main(String[] args) {
        StringBuilder obj =new StringBuilder("java");

        StringBuilder obj1 = new StringBuilder("java");

        boolean result = obj.equals(obj1);
        System.out.println(result);

        String s1 ="java";
        String s2 ="java";

//        s2.concat("programing");

        boolean result1 = s1.equals(s2);
        System.out.println(result1);


    }
}
