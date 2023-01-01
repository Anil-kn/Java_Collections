package javabasicprogrammes;

public class Armstrongnumberbtw {

   // % will return last digit number  and  / divison peratr which eliminates number
    public static void main(String args[])
    {

        for (int n = 1; n <= 1000; n++) {
            int a, i = 0, j = 0;
            a = n;
            while (a > 0) {
                i = a % 10;
                j =(i * i * i)+j;
                a = a / 10;
            }
            if (n == j) {
                System.out.println(n);
            }
        }



    }

}

