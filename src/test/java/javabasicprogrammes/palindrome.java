package javabasicprogrammes;

import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){
        int rev=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int num=scan.nextInt();

        int  org_num=num;

        while (num>0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("reversed number" +   rev);
        if(org_num==rev)
        {
            System.out.print("it is palindrome number"+ org_num);
        }

    }



}
