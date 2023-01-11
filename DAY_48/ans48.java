import java.util.*;
import java.io.*;
import java.lang.*;

class ans48
{

  public static void main(String args[])
  {
     ans48 obj = new ans48();
     Scanner ob = new Scanner(System.in);
         System.out.println("Enter the size of array :");
         int n = ob.nextInt();
         int a[] = new int[n];
         
         int set=0;
         
         System.out.println("Enter elements");
         for(int j=0;j<n;j++)
         {
            a[j] = ob.nextInt();
         } 
        System.out.println("array element before removing dup elements ");
        System.out.println("");
        for(int j=0;j<n;j++)
         {
            System.out.print(a[j]+" ");
         } 
        System.out.println("");    
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
        
        System.out.println("array element after removing dup elements ");
        System.out.println("");
        for(int j=0;j<n;j++)
         {
            System.out.print(a[j]+" ");
         } 
         
  }
}
