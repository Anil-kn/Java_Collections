package Java_Collections;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {

    public static void main(String[] args) {


        LinkedList ll = new LinkedList();

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

        ll.add(2,"python");
        System.out.println(ll);

        System.out.println(ll.get(2));

        ll.set(2,"insert");
        System.out.println(ll);


        System.out.println(ll.contains("Java"));
        System.out.println(ll.contains("anil"));


        System.out.println(ll.isEmpty());

        //


        for(int i=0;i<ll.size();i++)
        {
            System.out.println(ll.get(i));
        }


        for(Object i:ll)//each entry we consider as object in collection
        {
            System.out.println(i);
        }


        Iterator it= ll.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }


        LinkedList newll=new LinkedList();
        newll.addAll(ll);
        System.out.println("new array"+newll);

        newll.removeAll(ll);

        System.out.println(newll);


        System.out.println("elements"+ll);



        LinkedList ar=new LinkedList();
        ar.add(20);
        ar.add(10);
        ar.add(33);
        ar.add(441);
        Collections.sort(ar);
        System.out.println("after sorting"+ar);
        Collections.sort(ar,Collections.reverseOrder());
        System.out.println("after sorting"+ar);

        Collections.shuffle(ar);
        System.out.println("elements shuffled "+ar);

        //Special Methods

ar.addFirst("First");
ar.addLast("last");

System.out.println(ar);

System.out.println(ar.get(0));
        System.out.println(ar.getFirst());
        System.out.println(ar.getLast());
        System.out.println(ar.getClass());

        ar.removeFirst();
                ar.removeLast();
System.out.println(ar);



    }
}