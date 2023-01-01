package javabasicprogrammes;

import java.util.Scanner;

public class Sumofdigits {
    public static void main(String args[])
    {
        int sum,i=0,j=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("this  is the number");
        int num=scan.nextInt();

        while (num>0)
        {
            i=num%10;
            j=j+i;
            num=num/10;
        }
        System.out.println("the sum of digits is"+j);
    }



}
