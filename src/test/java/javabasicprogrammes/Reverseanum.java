package javabasicprogrammes;

import java.util.Scanner;

public class Reverseanum {
    public static void main(String args []) {


        Scanner scan = new Scanner(System.in);
        System.out.println("enter the input");
        int num = scan.nextInt();

    //using 1 algo                  //num=1234
        int rev=0,rev1 =0;            //rev=0
        while (num != 0)
        {
            rev1=num%10;
            rev = rev * 10+rev1;    //0*10+1234%4|rev=4   4*10+123/10  rev=40+3    43*10+12%10  432  432*10+1%10  4321
            num = num / 10;              //1234/10 num=123      num=12                num=1       num=0
        }
        System.out.println("reverse number is:- "+rev);

//2nd algo
//        StringBuffer str=new StringBuffer(String.valueOf(num));
//                  StringBuffer  rev1=str.reverse();
//                  System.out.println(rev1);
//
//

//using string builder
//        StringBuilder sbl=new StringBuilder();
//        sbl.append(num);
//        sbl.reverse();
//        System.out.print(sbl);


    }

}

//num%10  will gives remainder result
//num/10 which removes the last char (gives quotient)