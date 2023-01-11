import java.util.*;
import java.io.*;
import java.lang.*;

class ans49
{

  public static void main(String args[])
  {
     ans49 obj = new ans49();
     Scanner ob = new Scanner(System.in);
         System.out.println("Enter the size of array :");
         int n = ob.nextInt();
         int a[] = new int[n];
         int b[] = new int[n];
         int set=0;
         int sum=0;
         System.out.println("Enter elements IN ARRAY A");
         for(int j=0;j<n;j++)
         {
            a[j] = ob.nextInt();
         } 
         System.out.println("Enter elements IN ARRAY B");
         for(int j=0;j<n;j++)
         {
            b[j] = ob.nextInt();
         } 
         for(int j=n-1,i=0;i<n;i++,j--)
         {
            sum=sum+(a[i]*b[j]);
         }
       
        System.out.println("output ");
        System.out.println("");
        System.out.print(sum);
       
         
  }
}
