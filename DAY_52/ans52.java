import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

class ans52
{

  public static void main(String args[])
  {
     ans52 obj = new ans52();
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
        for(int i=0,j=n-1;i<j;i++,j--)
        {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
       
        System.out.println("output ");
         for(int j=0;j<n;j++)
         {
            System.out.print(a[j]+" ");
         } 
         
  }
}
