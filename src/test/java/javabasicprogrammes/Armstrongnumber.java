package javabasicprogrammes;

import java.util.Scanner;

public class Armstrongnumber {

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int num =scan.nextInt();
        int a,i=0,j=0;
        a=num;

        while (a>0)
        {
            i=a%10;
            j=(i*i*i)+j;  //163
            a=a/10;

        }
        if (num==j){
            System.out.println("thisnis armstrong"+j);
        }
        else
        {
            System.out.println("it is not an armstrong number");
        }

    }


}
