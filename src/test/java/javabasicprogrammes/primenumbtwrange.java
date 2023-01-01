package javabasicprogrammes;

public class primenumbtwrange {

    public static void main(String[] args)
    {

        int min=2, max=10;

        for(int n=min;n<=max;n++)
        {
            int count=0;
            for(int j=2;j<n;j++)
            {
                if(n%j==0)
                {
                    count++;
                }
            }
            if(count==0)
            System.out.println(" it is prime num:-"+n);

        }


    }


}
