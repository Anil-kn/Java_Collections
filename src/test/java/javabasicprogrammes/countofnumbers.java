package javabasicprogrammes;

import java.util.Scanner;

//No of digits
public class countofnumbers {
    public static void main(String args[])
    {
        int n,i=0;
       int sum_of_digits=0;
        System.out.println("Enter a number");
        Scanner get=new Scanner(System.in);
        n=get.nextInt();
        while(n>0)
        {
            n=n/10;
            //sum_of_digits=sum_of_digits+n;
            sum_of_digits+=n;
            i++;
        }
        System.out.println("No of digits present: "+i);
        System.out.println("sum_of_digits:-: "+sum_of_digits);
    }
    }


