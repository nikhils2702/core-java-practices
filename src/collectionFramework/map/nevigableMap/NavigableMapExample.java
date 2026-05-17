package collectionFramework.map.nevigableMap;

import java.util.TreeMap;

public class NavigableMapExample {

    public static void main(String[] args) {

        TreeMap<String, String> t = new TreeMap<String, String>();
         t.put("A","Pune");
         t.put("B","Mumbai");
         t.put("C","Delhi");
         t.put("D","Bengluru");

        System.out.println(t);
        System.out.println(t.ceilingKey("C"));
        System.out.println(t.higherKey("e"));
        System.out.println(t.floorKey("e"));
        System.out.println(t.lowerKey("e"));
        System.out.println(t.pollFirstEntry());
        System.out.println(t.pollLastEntry());
        System.out.println(t.descendingMap());

        System.out.println(t);

    }
}
