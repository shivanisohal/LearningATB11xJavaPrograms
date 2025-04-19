package Collection.Map;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {


        Map m= new Hashtable();
        m.put("Number1", 34);
        m.put("Number2",55);
        m.put("Number3",56);
        m.put("Number3",57);
        m.put("Number5",55);
       // m.put(null,23);
       // m.put(null,65);
       // m.put("Number4",null);
       // m.put("Number6",null);
        System.out.println(m.get("Number1"));
        System.out.println(m.size());
        System.out.println(m.containsKey("Number2"));
        System.out.println(m.isEmpty());
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println("Hash Map output---> "+m);
    }
}
