package collectionFramework.map.treeMap;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap m = new TreeMap();

        m.put(100, "zzz");
        m.put(200, "yyy");
        m.put(300, "xxx");
        m.put(104, 105);
//        m.put("www","eee"); //CCE
//        m.put(null,"xxx");  //NPE

        System.out.println(m);
    }
}
