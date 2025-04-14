package Collection.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Nested_ArrayList {
    public static void main(String[] args) {
        List<String> lists=new ArrayList<>();
        lists.add("ABC");
        lists.add("efg");
        lists.add("hij");

        List list2=new ArrayList<>();
        list2.add("ABC");
        list2.add("EFG");
        list2.add("HIJ");

        List list3=new ArrayList<>();
        list3.add(lists);
        list3.add(list2);

        System.out.println(list3.get(0));
        System.out.println(list3.get(1));


    }
}
