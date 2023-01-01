package javabasicprogrammes;

import java.util.Arrays;
import java.util.Collections;

public class Sort_inbuilt_methods {
    public static void main(String [] args)
    {
        int a[]={3,5,1,2,1,3};
        System.out.println("Arrays before sorting:-"+ Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("Arrays before sorting1:-"+ Arrays.toString(a));

        int b[]={3,7,8,1,9};
        Arrays.sort(b);
        System.out.println("Arrays after sorting2:-"+ Arrays.toString(b));

        Integer c[]={3,7,8,1,9};
        Arrays.sort(c, Collections.reverseOrder());
        System.out.println("Arrays after sorting3:-"+ Arrays.toString(c));


    }

}
