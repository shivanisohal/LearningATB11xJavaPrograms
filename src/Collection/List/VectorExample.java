package Collection.List;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> v=new Vector<>();
        v.add("ABC1");
        v.add("ABC2");
        v.add("ABC3");
        v.add("ABC4");
        v.add("ABC5");

        ListIterator listiterator= v.listIterator();

        while(listiterator.hasNext())
        {
            System.out.println(listiterator.next());
        }

        System.out.println("--------------");
        while (listiterator.hasPrevious())
        {
            System.out.println(listiterator.previous());
        }
    }
}
