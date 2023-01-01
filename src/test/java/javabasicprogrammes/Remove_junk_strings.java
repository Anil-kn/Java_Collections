package javabasicprogrammes;

public class Remove_junk_strings {
    //use the regular expression char operator
    public static void main(String[] args) {
        String s = "3432445566fdvx@@!)+_)(**&&!";
        String r=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(r);
    }
}

