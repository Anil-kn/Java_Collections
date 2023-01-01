package Java_Collections;

import java.util.*;

public class HashTableClass {

    public static void main(String [] args)
    {

        Hashtable hs=new Hashtable();
        hs.put(101,"anil");
        hs.put(102,"kiran");
        hs.put(103,"prabhu");
        hs.put(104,"gaja");
        hs.put(105,"arjun");
        hs.put(106,"varun");

        System.out.println(hs);

        System.out.println(hs.get(101));

        System.out.println(hs.remove(102));
        System.out.println(hs);

        System.out.println(hs.containsKey(102));
        System.out.println(hs.containsValue("kiran"));

        System.out.println(hs.isEmpty());
        System.out.println(hs.keySet());//list of keys
        System.out.println(hs.values());//list of values
        System.out.println(hs.entrySet());//list

        for (Object i: hs.entrySet())
        {
            System.out.println(i);
        }

        for (Object i:hs.keySet())
        {
            System.out.println(i);
        }

        for (Object i: hs.values())
        {
            System.out.println(i);
        }


        for (Object i: hs.keySet())
        {
            System.out.println(i+" "+hs.get(i));
        }

        hs.forEach((key, value) -> System.out.println(key + " " + value));


        //Analyse this method error
//        for (Map.Entry entry: hs.entrySet())
//        {
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }


        Set s=hs.entrySet();

        Iterator it=s.iterator();

        while (it.hasNext())
        {
            Map.Entry entry= (Map.Entry) it.next();
            System.out.println(entry.getKey());
        }




    }

//read some theory documents

}
