package javabasicprogrammes;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args)
	{
	  int	count=0;
		System.out.println("enter the num");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
	    	    count++;
				}
	                	if(count==2)
	                	{
	    		  System.out.println("it is prime number");
	                	}

	                	else {
	    		  System.out.println("it is not prime number");
	    	       }
	                }


	      else {

	 System.out.println("is not prime number"+num);

 }

//  range of prime number
//	                for(int i=2;i<num;i++)
//	                {
//
//	                	for(int j=2;j<i;j++)
//	                	{
//	                		if(i%j==0)
//	                		{
//	                			count++;
//	                		}
//	                	}
//	                	if(count==0)
//	                	{
//	                		System.out.println(i+"");
//	                	}
//
//	                }


//prime num= which is divisible by 1 and itself
//if range we exclude 1 and itself if divide by other in btw then it won't be prime



	}

}
