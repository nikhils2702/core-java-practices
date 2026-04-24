package collectionFramework.collection.Enumeration;


import java.util.Enumeration;
import java.util.Vector;

//Enumeration is cursor which is used to retrive collection object one by one,
public class EnumerationCursor {

    public static void main(String[] args) {

        Vector v =new Vector();

        v.add(10);
        v.add("nikhil");
        v.add(15.4);

        System.out.println(v);

        Enumeration e= v.elements();

        while (e.hasMoreElements()){
            System.out.println(e.nextElement());

        }

    }
}
