package Java_Collections;

import io.cucumber.java.sl.In;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashsetClass {

    public static void main(String [] args)
    {

        HashSet ll = new HashSet();

        //Add new elements  ll.add() not working
        //Add new elements
        ll.add(10);
        ll.add(20);
        ll.add(200);
        ll.add(30);
        ll.add("anil");
        ll.add(true);

        System.out.println(ll);
        System.out.println(ll.size());

        ll.remove(1);
        ll.remove("anil");

        System.out.println(ll);


        System.out.println(ll.contains("Java"));
        System.out.println(ll.contains("anil"));


        System.out.println(ll.isEmpty());




//        for(int i=0;i<ll.size();i++)
//        {
//            System.out.println(ll.get(i));
//        }


        for(Object i:ll)//each entry we consider as object in collection
        {
            System.out.println(i);
        }


        Iterator it= ll.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }


        HashSet newll=new HashSet();
        newll.addAll(ll);
        System.out.println("new array"+newll);

        newll.removeAll(ll);

        System.out.println(newll);


        HashSet <Integer> set1=new HashSet <Integer>();

        set1.add(10);
        set1.add(33);
        set1.add(48);
        set1.add(50);
        set1.add(66);
        set1.add(99);


        HashSet <Integer> set2=new HashSet <Integer>();
        set2.add(10);
        set2.add(33);
        set2.add(482);
        set2.add(504);

        //union
        set1.addAll(set2);
        System.out.println("Union all"+set1);

        //intersection
        set1.retainAll(set2);
        System.out.println("Intersection"+set1);

        set1.removeAll(set2);
        System.out.println("remove all "+set1);

        //subset
        set1.containsAll(set2);
        System.out.println("subset"+set1);

    }

}
