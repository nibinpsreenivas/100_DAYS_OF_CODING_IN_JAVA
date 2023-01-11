import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

class ans50
{

  public static void main(String args[])
  {
     ans50 obj = new ans50();
     Scanner ob = new Scanner(System.in);
         System.out.println("Enter the size of array :");
         int n = ob.nextInt();
         int a[] = new int[n];
         int set=0;
         int sum=0;
         System.out.println("Enter elements IN ARRAY ");
         for(int j=0;j<n;j++)
         {
            a[j] = ob.nextInt();
         } 
        for(int j=0;j<n;j++)
        {
            a[j] = Math.abs(a[j]);
        } 
            
         
         for(int i=0;i<n;i++)
        {
           if(i==0)
           {
             continue;
           }
           else
           {
             set=-1;
              for(int j=0;j<=i;j++)
              {
                if(a[i]==a[j] && i!=j)
                {
                  set=j;
                  break;
                }
              }
            if(set!=-1)
            {
              n=n-1;
              for(int k=set;k<n;k++)
              {
                 a[k]=a[k+1];
              }
            }
          }
        }
          System.out.println(" ");
        
         for(int i=0;i<n;i++)
         {
            sum=sum+(a[i]*a[i]);
         }
       
        System.out.println("output ");
      
        System.out.print(sum);
       
         
  }
}
