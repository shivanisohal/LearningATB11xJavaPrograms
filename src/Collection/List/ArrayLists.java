package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add(12);//0
        list.add("abc");//1
        list.add(23);//2
        list.add(45);//3
        list.add(45);//4
        System.out.println(list.size());
        System.out.println(list.indexOf(45));
        System.out.println(list.contains(23));
        System.out.println(list.lastIndexOf(45));

        System.out.println("-----------------");

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

    }
}
