package collectionFramework.map.hashMap;

import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap m = new HashMap();

        m.put("nikhil", 10);
        m.put("Shinde", 20);
        m.put("pune", 200);
        m.put("TDIT", 1000);

        System.out.println(m);  // {nikhil=10, Shinde=20, pune=200, TDIT=1000}

        System.out.println(m.put("nikhil", 2000)); // 10 returns old value

        Set s = m.keySet();  // return only key

        System.out.println(s);  // return only key [nikhil, Shinde, pune, TDIT]

        Collection c = m.values();  // return only values

        System.out.println(c);   // [2000, 20, 200, 1000]

        Set s1 = m.entrySet();  //[k = v,...]

        System.out.println(s1);  // [nikhil=2000, Shinde = 20, pune=200, TDIT = 1000]


        Iterator itr = s1.iterator();

        while(itr.hasNext()){
           Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey() + " "+ m1.getValue());

            if(m1.getKey().equals("JAVA")){
                m1.setValue(100000);
            }
        }

        System.out.println(m);
    }
}
