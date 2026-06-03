package java8Fetures.functionalInterface.FIComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 class MyComparator1 implements Comparator<Integer> {

    public int Comparator(Integer I1, Integer I2){

        return (I1<I2)?-1 : (I1>I2)?2: 0;  //lambda expression If, Else If statement

//        if(I1 < I2){
//            return 1 ;
//        } else if (I1 > I2) {
//            return -1;
//        }else {
//            return 0;
//        }

    }



     @Override
     public int compare(Integer o1, Integer o2) {
         return 0;
     }
 }

public class ComparatorFI  {

    public static void main(String[] args) {

        ArrayList<Integer> al =new ArrayList<Integer>();

        al.add(10);
        al.add(70);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);

        System.out.println(al);
        Comparator<Integer> c=(I1,I2) -> (I1<I2)?-1 : (I1>I2)?1: 0;
        Collections.sort(al,c);
        System.out.println(al);

        al.stream().forEach(System.out::println);

    }
}
