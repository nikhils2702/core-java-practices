package collectionFramework.collection.list.vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector v =new Vector();

        v.add("shinde");
        v.add(1,"shinde");
        v.addElement("nikhil");
        v.add(100);
        v.add(200);

        System.out.println(v);
        System.out.println(v.lastElement());

        System.out.println(v.removeElement("shinde"));
        System.out.println(v);
    }
}
