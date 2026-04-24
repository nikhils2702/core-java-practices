package collectionFramework.collection.list.arrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList al2 =new ArrayList();

        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(40);


        ArrayList al = new ArrayList(al2);

        System.out.println(al);

        System.out.println(al.contains("nikhil")); //false
        System.out.println(al.contains(20)); //true

        System.out.println(al.size()); //4

        System.out.println(al.get(3)); //40

        System.out.println(al.set(2,80));

        System.out.println(al);

    }
}
