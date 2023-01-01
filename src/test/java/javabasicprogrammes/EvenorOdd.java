package javabasicprogrammes;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number1");
        int num=scan.nextInt();

        if (num%2==0)
        {
            System.out.println("the number is even"+num);
        }
        else
        {
            System.out.println("the number is odd"+num);
        }

    }
}

