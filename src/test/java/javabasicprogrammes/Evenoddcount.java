package javabasicprogrammes;

public class Evenoddcount {

    public static void main(String args[])
    {

        int evencount=0;
        int oddcount=0;

        for (int num=0;num<=100;num++)
        {
        if (num%2==0)
        {
            evencount++;

        }
        else
        {
           oddcount++;
        }
        }
        System.out.println("the number is even:- "+evencount);
        System.out.println("the number is odd:- "+oddcount);

    }
}
