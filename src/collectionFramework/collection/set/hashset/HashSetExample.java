package collectionFramework.collection.set.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("nik");
        al.add("shinde");
        al.add(20);

        HashSet hs =new HashSet(al);

        hs.add(10);
        hs.add("nikhil");
        hs.add("shinde");
        hs.add(100.4);
        hs.add(null);

        System.out.println(hs);

        Iterator itr = hs.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());

        }

    }
}
