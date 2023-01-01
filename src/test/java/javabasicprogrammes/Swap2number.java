package javabasicprogrammes;

import java.util.Scanner;

public class Swap2number {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number1");
        int a=scan.nextInt();
        System.out.println("enter the number2");
        int b=scan.nextInt();
        //using 3rd variable
//        int c=0;
//
//         c=a;
//         a=b;
//         b=c;

        //without  3rd variable

        a=a+b;
        b=a-b;
        a=a-b;



         System.out.println("enter number1 a:- "+a);
        System.out.println("enter number2 b:- "+b);

    }



}
