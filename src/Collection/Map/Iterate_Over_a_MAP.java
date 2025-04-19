package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Iterate_Over_a_MAP {
    public static void main(String[] args) {



        Map<String,Integer> m = new HashMap();
        m.put("A",123);
        m.put("B",234);
        m.put("C",676);
        m.put("D",897);
        m.put("E",755);
        m.put("F",null);
        m.put("G",null);



        for(Map.Entry<String,Integer> entry : m.entrySet())
        {
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }

        //Syntax---for (Map.Entry<KeyType, ValueType> entry : mapName.entrySet()) {
        //    System.out.println(entry.getKey() + " => " + entry.getValue());
        //}

        //Part	Meaning
        //Map.Entry<KeyType, ValueType>	A special object that stores one (key, value) pair from the map
        //entry	Just a variable name (you can name it anything, like e, item)
        //mapName.entrySet()	Returns a set of all (key, value) pairs from the map
        //for (...)	Loops through each entry in the map
        //entry.getKey()	Gets the key from the current entry
        //entry.getValue()	Gets the value from the current entry

        //------------------------------If you use Java 10 or above, you can simplify:
        //New way -- > for (var entry : students.entrySet()) {
        //    System.out.println(entry.getKey() + " => " + entry.getValue());
        //}

        System.out.println("------------Shortcut method---------");
        for(var entry : m.entrySet() )
        {
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }


    }
}
