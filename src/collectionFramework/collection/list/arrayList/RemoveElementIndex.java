package collectionFramework.collection.list.arrayList;

import java.util.ArrayList;

public class RemoveElementIndex {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(10);
        al.add(20);
        al.add(30);

        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(40);
        al1.add(50);
        al1.add(60);

        al1.addAll(al);

        System.out.println(al1);

        al1.remove(2);

        System.out.println(al1);

        al1.set(1, null);

        System.out.println(al1);

    }
}
