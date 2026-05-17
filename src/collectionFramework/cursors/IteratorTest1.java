package collectionFramework.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest1 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            al.add(i);
        }


        System.out.println(al);

        Iterator itr = al.iterator();


        while(itr.hasNext()){
            Integer i = (Integer) itr.next();
            System.out.println(i);

            if(i % 2 == 0){
                itr.remove();
            }
            System.out.println(al);

        }
    }
}
