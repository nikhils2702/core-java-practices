package collectionFramework.map.treeMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class TreeDemoComparator {

    public static void main(String[] args) {

//        TreeMap t = new TreeMap(new MyComparator()) {
//            t.put("xxx",10);
//            t.put("yyy",20);
//            t.put("zzz",30);
//            t.put("lll",40);
//
//            System.out.println(t);
//
//        }
    }

            class MyComparator implements Comparator{

                public int compare(Object obj1, Object obj2) {
                    String s1 = obj1.toString();
                    String s2 = obj2.toString();

                    return s2.compareTo(s1);
                }
            }
        }