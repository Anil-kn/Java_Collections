package Java_Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueClass {
    public static void main(String args[])
    {


        PriorityQueue q=new PriorityQueue();

        //Adding elements add()  offer()
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("e");
        q.add("f");
//        q.add(123);
//        q.add(true);

        System.out.println(q);


        System.out.println(q.element());//returns head of element,if empty returns Nosuchelement exception
        System.out.println(q.peek());//A returns Head element,if empt returns null

//returns and remove elemet from queue

        System.out.println(q.poll());//Null
        q.remove("e");
        System.out.println("after remove"+q);//returns no such elemnt exception


        Iterator it=q.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }


        LinkedList al=new LinkedList();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("e");
        al.add("f");
        al.add(123);
        al.add(true);

        System.out.println(al);


    }
}


//Queue doesnot hold hetero geneous data
//that's why  Queue implements Linked List
