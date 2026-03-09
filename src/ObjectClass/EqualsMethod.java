package ObjectClass;

public class EqualsMethod {
     String name;
     int rollNo;

     EqualsMethod(String name, int id){
         this.name =name;
         this.name =name;
     }
     public static void main(String[]args){

         String s1 = new String("Ganga");
         String s2 = new String("Ganga");
         System.out.println(s1.equals(s2));

         StringBuffer s3 = new StringBuffer("TDIT");
//         StringBuffer s4 = new StringBuffer("TDIT");
        StringBuffer s4 =  s3.append("TDIT");
         System.out.println(s3.equals(s4));



//         EqualsMethod s1 = new EqualsMethod("Nikhil", 27);
//         EqualsMethod s2 = new EqualsMethod("Ravi", 28);
//         EqualsMethod s3 = new EqualsMethod("Shyam", 29);
//         EqualsMethod s4 = s1;
//
//         System.out.println(s1.equals(s2));
//         System.out.println(s1.equals(s3));
//         System.out.println(s1.equals(s4));
//         System.out.println(s1.getClass());



     }

}
