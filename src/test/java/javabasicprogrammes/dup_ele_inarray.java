package javabasicprogrammes;

public class dup_ele_inarray {
    public static void main(String [] args)
    {
        String a[]={"java","python","c++","java"};

        boolean flag=false;
        for (int i=0;i<a.length-1;i++)
        {
            for (int j=i+1;j<=a.length-1;j++)
            {
                if (a[i]==a[j])
                {
                    System.out.println("duplicate ele:-"+a[i]);
                    flag=true;
                }
            }

        }
        if (flag==true)
        {
            System.out.println("duplicate  value found");
        }
        else
        {
            System.out.println("duplicate value not  found:-");
        }
    }
}
