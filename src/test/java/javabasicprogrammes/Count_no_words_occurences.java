package javabasicprogrammes;

public class Count_no_words_occurences {

    public static void main(String [] args)
    {
        String str="Hi this is java class Anil";
        int totallen=str.length();
        System.out.println("total string length:- "+totallen);

        str=str.replaceAll("a","");
        int afterlen=str.length();
        System.out.println("total len after removal of string:- "+afterlen);

        int  no_occr_words=totallen-afterlen;
        System.out.println("No of words occurenc:- "+no_occr_words);
    }

}
