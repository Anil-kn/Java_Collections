package javabasicprogrammes;

public class Linearsearch {

    public static void main(String [] args)
    {
        int arr[]={10,20,30,40,50};
        int linearsearch=520;
        boolean flag=false;

        for(int i=0;i<=arr.length-1;i++)
        {
            if(linearsearch==arr[i])
            {
                System.out.println("element found at :- "+arr[i]+" "+i);
                flag=true;
            }
        }
        if(flag==false)
        {
            System.out.println("element not found:- ");
        }


    }



}
