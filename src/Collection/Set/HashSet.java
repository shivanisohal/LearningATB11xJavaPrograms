package Collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet {
    public static void main(String[] args) {

        System.out.println("-----------HashSet");
        Set<String> set=new java.util.HashSet<>();
        set.add("Apple");
        set.add("Apple");
        set.add("Apple1");
        set.add("Apple2");
        // set.add(123);
        set.add(null);
        set.add(null);
        System.out.println(set);

        System.out.println("----------LinkedHashSet");

        LinkedHashSet<String> LH= new LinkedHashSet<>();
        LH.add("Apple");
        LH.add("Apple");
        LH.add("Apple1");
        LH.add("Apple2");
        LH.add(null);
        LH.add(null);
        System.out.println(LH);

        System.out.println("------------TreeSet");

        TreeSet<String> TS= new TreeSet<>();
        TS.add("Apple");
        TS.add("Apple");
        TS.add("Apple1");
        TS.add("Apple2");
        //TS.add(null); not allowed
        //TS.add(null);
        System.out.println(TS);

        //For Each loop

        for(Object obj:TS)
        {
            System.out.println(obj);
        }

    }
}
