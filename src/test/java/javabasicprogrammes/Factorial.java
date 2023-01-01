package javabasicprogrammes;

import java.util.Scanner;

public class Factorial {
    public static void main(String args []){
        int fact=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number for fact");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.print("entered the factorial of num"+" "+ fact);

}
}
