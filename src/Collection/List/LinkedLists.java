package Collection.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.addFirst("shiv");
        list.addLast("sohal");

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("shiv"));
        System.out.println(list.indexOf("B"));
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
