package javabasicprogrammes;

public class Max_value_Array {
    public static void main(String [] args){
        int a[]={1,2,4,5,6,8};

        int max=a[0];

        for (int i =1;i<=a.length-1;i++)
        {
            if (a[i]>max)
            {
                max=a[i];
            }

        }

        System.out.println("maximum value:-"+max);


        int min=a[0];

        for (int i=1;i<=a.length-1;i++)
        {
            if (a[i]<min)
            {
                min=a[i];
            }

        }
        System.out.println("Minimum value:- "+min);

    }

}
