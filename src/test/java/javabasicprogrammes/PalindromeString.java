package javabasicprogrammes;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string ");
        String orgstring=scan.nextLine();

        String revString="";
        int lenstring=orgstring.length();

     for (int  i=lenstring-1;i>=0;i--)
     {
            revString  =revString+orgstring.charAt(i);
         System.out.println("print extracted reverse string"+revString);

     }

        if (revString.equals(orgstring))
        {
            System.out.println("this  is palidrome strng"+revString);
        }
        else
        {
            System.out.println("it's not a palindrome string:- "+orgstring);
        }


    }
}
