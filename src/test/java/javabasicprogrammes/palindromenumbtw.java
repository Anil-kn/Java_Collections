package javabasicprogrammes;

public class palindromenumbtw {
    public static void main(String args[])
    {
        for (int num = 1; num <= 100; num++) {
            int temp, rem= 0,rev= 0;
            temp= num;
            while (temp> 0) {
                //rem = temp % 10;
                rev = (rev * 10) + temp % 10;
                temp = temp / 10;
            }
            if (num== rev) {
                System.out.println(num);
            }
        }
    }

}





