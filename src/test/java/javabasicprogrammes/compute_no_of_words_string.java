package javabasicprogrammes;

import java.util.Scanner;

public class compute_no_of_words_string {

    public static void main(String []args){
        {
            Scanner scan =new Scanner(System.in);
            System.out.println("enter string");
            String x  =scan.nextLine();
            //approach1
//            String y[]= x.split(" ");
//            System.out.println(y.length);
//

            int count=1;
            for (int i=0;i<=x.length()-1;i++)
            {
                if((x.charAt(i)==' ') && (x.charAt(i+1)!=' '))
                {
                 count++;
                }
            }

            System.out.println("total no of words"+count);

        }
    }

}
