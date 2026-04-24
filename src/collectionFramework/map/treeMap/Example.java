package collectionFramework.map.treeMap;

import java.util.TreeMap;

public class Example {
    public static void main(String[] args) {

        TreeMap map = new TreeMap();

        map.put(101,"nikhil");
        map.put(102,"shinde");
        map.put(103,"pune");

        System.out.println(map);

        System.out.println(map.ceilingEntry(103)); //103 key value pune

        System.out.println(map.ceilingKey(102));  //only kay value

        map.clear();  //clear all

        map.containsKey(104);  // false

        System.out.println(map.get(103));

        System.out.println(map.headMap(102));

    }
}
