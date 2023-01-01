package javabasicprogrammes;

public class Remove_white_spaces {

    public static void main(String [] args){
        String str="Hi This is ANil";
        String str1=str.replaceAll(" ",""); // we canuse \\s
        System.out.println(str1);
    }
}


