package ObjectClass.getClassMethod;

public class GetClassTest {
    public static void main(String[] args) {
        int Count = 0;

        Object o= new String("Java");
        Class c = o.getClass();
        System.out.println("fully qualifyed name of class"+ c.getName());
//        method[] m = c.getDeclaredMethod();
//        System.out.println("method Informetion");
//        for(method m1:m){
//            count++;
//            System.out.println(m1.getName());
//        }
//        System.out.println("the number of method"+ count);


    }
}
