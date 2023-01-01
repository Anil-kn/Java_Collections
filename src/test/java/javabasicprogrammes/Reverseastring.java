package javabasicprogrammes;

public class Reverseastring {

    public static void main(String args[])
    {
        String str="Anil";
        String rev="";


        //int lenstr=str.length();

        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.print(rev);


//
//      char a[]=str.toCharArray();
//     int  len=a.length;
//
//     for (int i=len-1;i>=0;i--)
//     {
//         rev=rev+a[i];
//     }
//     System.out.println("reversed string:-  "+ rev);



//     StringBuffer sb=new StringBuffer(str);
//     System.out.println(sb.reverse());

    }

}
