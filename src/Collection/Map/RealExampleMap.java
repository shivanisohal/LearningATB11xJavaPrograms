package Collection.Map;

import java.sql.SQLOutput;
import java.util.*;
import java.util.HashMap;

public class RealExampleMap {
    public static void main(String[] args) {

        Map<String,Object> m1=new HashMap<>();
        m1.put("Name","Shivani");
        m1.put("Phonenumber",12345678);
        m1.put("address","delhi");
        m1.put("address","HP");


        Map<String, Object> m2=new HashMap<>();
        m2.put("Name","Rahul");
        m2.put("Phonenumber",1234533322);
        m2.put("address","pune");

        List Students = new ArrayList();
        Students.add(m1);
        Students.add(m2);
        System.out.println(Students);

        //HashSet

        Set S1=new HashSet();
        S1.add("Shiv");//no duplicate allowed
        S1.add("Shiv");
        S1.add(1233);
        S1.add("KANPUR");
        System.out.println(S1);


    }
}
