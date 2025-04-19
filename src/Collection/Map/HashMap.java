package Collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap {
    public static void main(String[] args) {

        //Syntax - Map<KeyType, ValueType> mapName = new HashMap<>();

        Map<String,Integer> m= new java.util.HashMap();
        m.put("Number1", 34);
        m.put("Number2",55);
        m.put("Number3",56);//duplicate key not allowed, 57 will print bcoz that one is latest
        m.put("Number3",57);
        m.put("Number5",55);
        m.put(null,23);
        m.put(null,65);
        m.put("Number4",null);
        m.put("Number6",null);
        System.out.println(m.size());
        System.out.println(m.containsKey("Number2"));
        System.out.println(m.isEmpty());
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println("Hash Map output---> "+m);

        Map<String, Integer> m1= new LinkedHashMap();//Order, as added by user
        m1.put("Number1", 34);
        m1.put("Number2",55);
        m1.put("Number3",56);//duplicate key not allowed, 57 will print bcoz that one is latest
        m1.put("Number3",57);
        m1.put("Number5",55);
        m1.put(null,23);
        m1.put("Number4",null);
        System.out.println("LinkedHashMap output---> "+m1);

        Map m3= new TreeMap();
        m3.put("name","shivani");
        m3.put("Address",1233);
        m3.put("phone",223338890);
        m3.put("car",455);
       // m3.put(null,23);
        m3.put("Number4",null);

        System.out.println("Tree Map output---> "+m3);



    }
}
