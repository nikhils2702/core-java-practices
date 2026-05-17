package collectionFramework.collection.list.listExample;

import java.util.ArrayList;
import java.util.List;

public class ListAddElements {

    public static void main(String[] args) {

        List li = new ArrayList();

        li.add("A");
        li.add("B");
        li.add("C");
        li.add("D");
        li.add("27");

        li.add(4,"E");
        li.add(5,"F");


        System.out.println(li.size());
        System.out.println(li);

    }
}
