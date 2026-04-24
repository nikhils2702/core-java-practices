package collectionFramework.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterExample {
    public static void main(String[] args) {
        List l = new ArrayList();

        l.add(10);
        l.add("nikhil");
        l.add("shinde");

        System.out.println(l);


        Iterator itr = l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
