package collectionFramework.cursors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IterationTest2 {

    public static void main(String[] args) {

        Collection<String> colle = new ArrayList<String>();

        colle.add("a");
        colle.add("b");
        colle.add("c");
        colle.add("d");
        colle.add("e");

        System.out.println(colle);

        Iterator itr = colle.iterator();

        while(itr.hasNext()){

            System.out.println(itr.next().toString() + " ");
        }
        System.out.println();

    }
}
