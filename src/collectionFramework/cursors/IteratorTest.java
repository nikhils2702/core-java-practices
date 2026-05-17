package collectionFramework.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");

        Iterator <String> itr = al.iterator();

        while(itr.hasNext()){

            String str = itr.next();
            System.out.println(str + " ");
        }
    }
}
