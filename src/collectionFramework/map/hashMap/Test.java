package collectionFramework.map.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        HashMap<Integer,String> hm =new HashMap();

        hm.put(101,"nikhil");
        hm.put(102,"shinde");
        hm.put(103,"Tdit");
        hm.put(104,"pune");

        System.out.println(hm);

        for(Map.Entry me : hm.entrySet()){  // new type get key and value
            System.out.println(me.getKey()+ "=>"+me.getValue());
        }


//        Set set = hm.entrySet();
//
//        System.out.println(set);
//
//        Iterator itr = set.iterator();
//
//        while (itr.hasNext()){  //old type get kay and value
//            System.out.println(itr.next());  // value return in itr.
//
//            Map.Entry entry = (Map.Entry) itr.next();  //Type cast
//
//            System.out.println(entry.getKey()+"=>"+ entry.getValue()); // value return in one by one kay and value
//
//        }

    }
}
