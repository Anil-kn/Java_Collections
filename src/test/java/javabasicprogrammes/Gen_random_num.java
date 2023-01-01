package javabasicprogrammes;

import java.util.Random;

public class Gen_random_num {

    public static void main(String [] args)
    {
        Random rand=new Random();
        int randint=rand.nextInt(222);
        System.out.println(randint);

        double randbl=rand.nextDouble();
        System.out.println(randbl);


        System.out.println(Math.random());






    }

}
