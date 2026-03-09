package Array;

public class ArrayOddIndex {
     public static void main(String[] args) {

         int a[] = {12, 34, 76, 90, 56, 32, 78, 92, 11, 56};
         // index = 0   1    2   3  4   5   6   7   8   9


         int add = 0;

         for (int i = 0; i < a.length; i +=2) {
               add =+ a[i];

              System.out.println("value " + a[i]);

         }

             System.out.println(add);

     }
}
