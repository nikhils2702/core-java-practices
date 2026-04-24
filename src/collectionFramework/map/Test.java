package collectionFramework.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(101);
        al.add(102);
        al.add(103);

        Map mp = new HashMap();

        mp.put(101,"nikhil");
        mp.put(102, "shinde");
        mp.put(101, "shivam");
        mp.put(null, null);
        mp.put(null, "Rohitsharma");

        System.out.println(mp.containsKey(103));


        System.out.println(mp);
    }
}
