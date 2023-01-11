import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

class ans51
{

  public static void main(String args[])
  {
     ans51 obj = new ans51();
     Scanner ob = new Scanner(System.in);
         System.out.println("Enter the size of array :");
         int n = ob.nextInt();
         int a[] = new int[n];
         int temp=0;
         System.out.println("Enter elements IN ARRAY ");
         for(int j=0;j<n;j++)
         {
            a[j] = ob.nextInt();
         } 
        for(int i=0;i<n-1;i++)
        {
          for(int j=0;j<n-i-1;j++)
          {
            if(a[j]>a[j+1])
            {
              temp=a[j];
              a[j]=a[j+1];
              a[j+1]=temp;
           }
          }
       }
       
        System.out.println("output ");
         for(int j=0;j<n;j++)
         {
            System.out.print(a[j]+" ");
         } 
         
  }
}
