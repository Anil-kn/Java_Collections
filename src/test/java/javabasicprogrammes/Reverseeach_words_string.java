package javabasicprogrammes;

public class Reverseeach_words_string {
public static void main(String [] args)
{
    String s="welcome to anil learns";

    String  reversestring="";

    String [] words=s.split(" ");

    for (String w:words)
    {
        String  reverseword="";
     for(int i=w.length()-1;i>=0;i--)
        {
        reverseword=reverseword+w.charAt(i);
        }
     reversestring=reversestring+reverseword+" ";
    }


    System.out.println("reverse words in a string:-"+reversestring);
}
}
