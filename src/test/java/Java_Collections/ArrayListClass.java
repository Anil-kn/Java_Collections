package Java_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListClass {

    public static void main(String [] args)
    {

        //ArrayList <Integer> al=new ArrayList<Integer>();

        //ArrayList <String> al=new ArrayList<String>();
       // List al=new ArrayList();
       ArrayList al=new ArrayList();

        //Add new elements
        al.add(10);
        al.add(20);
        al.add(200);
        al.add(30);
        al.add("anil");
        al.add(true);

        System.out.println(al);
        System.out.println(al.size());

        al.remove(1);
        al.remove("anil");
     System.out.println(al);

     al.add(2,"python");
        System.out.println(al);

        System.out.println(al.get(2));
        al.set(2,"Java");
        System.out.println(al);
System.out.println(al.contains(200));
System.out.println(al.contains("Java"));
        System.out.println(al.contains("Python"));
System.out.println(al.isEmpty());

System.out.println("Reading elements from  the  loop----------------");


//for loop
        for(int i=0;i<al.size();i++)
        {
          System.out.println(al.get(i));
        }

        //For each

        for(Object i:al)
        {
            System.out.println(i);
        }

        Iterator it=al.iterator();

        while (it.hasNext())
        {
           System.out.println("through iterator"+it.next());
        }


        //Other Methods

        ArrayList al2=new ArrayList();

      System.out.println("New ArrayListcollection added"+al2.addAll(al)+al2);

System.out.println(al2.removeAll(al));
System.out.println(al2);



ArrayList ar=new ArrayList();
ar.add(20);
ar.add(10);
ar.add(33);
ar.add(441);

System.out.println("elements"+ar);
        Collections.sort(ar);
        System.out.println("after sorting"+ar);
        Collections.sort(ar,Collections.reverseOrder());
        System.out.println("after sorting"+ar);

        Collections.shuffle(ar);
        System.out.println("elements shuffled "+ar);


        //Arrays into ArrayList

        String array[]={"anil","kumar","Java","python"};

        for(String value:array)
        {
            System.out.println(value);
        }

        ArrayList array1=new ArrayList(Arrays.asList(array));
        System.out.println("Array to Array:List conversions "+array1);



    }
}
