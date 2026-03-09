package string;

public class StringBufferExample {
    public  String toString() {
         return getClass()+ "@" +
                Integer.toHexString(hashCode());
         }


    public static void main(String[]args){
        StringBufferExample obj = new StringBufferExample();

        System.out.println(obj.toString());

//        StringBuffer s1 = new StringBuffer("nikhil");
//
//        StringBuffer s2 = new StringBuffer("nikhil");

//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));

    }
}
