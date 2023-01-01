package javabasicprogrammes;

public class Missing_number {

	public static void main(String[] args)
	{
		
		int a[]= {1,2,4,5,6};
		 //1+2+4+5=sum1
		//1+2+3+4+5=sum2
		//sum2-sum1=missing
		
		int sum1=0,sum2=0;
	
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
			
		}
		
		System.out.println("sum of elements in array1:"+sum1);
		
		 for(int i=1;i<=5;i++)
		 {
			 sum2=sum2+i;
		 }
		
		 System.out.println("the sum1 is"+sum1);
		 System.out.println("sum of elements in sum2:"+sum2);
		 System.out.println("missing element is:"+(sum2-sum1));
		 
		 
		 
	}

}
