package collectionFramework.collection.list.linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        List la = new LinkedList();

        la.add("Pune");
        la.add("Mumbai");
        la.add("Benglore");
        la.add("Delhi");
        la.add("Hydrabad");

        System.out.println(la);

        la.remove(2);
        System.out.println(la);


        System.out.println("-----"+la.get(1));

        String city = la.get(2).toString();
        System.out.println(city);

         la.set(2,"Kolhapur");  // replece the element

        System.out.println(la);

    }
}
