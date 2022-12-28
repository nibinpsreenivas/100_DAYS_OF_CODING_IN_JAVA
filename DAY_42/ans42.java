import java.util.*;
import java.io.*;
import java.lang.*;

class ans42
{

  public static void main(String args[])
  {
     ans42 obj = new ans42();
     Scanner ob = new Scanner(System.in);
         System.out.println("Enter the size of first array :");
         int n1 = ob.nextInt();
         System.out.println("Enter the size of second array :");
         int n2 = ob.nextInt();
         if(n1==n2)
         {
             int error=0;
             int a[] = new int[n1];
             int b[] = new int[n1];
             System.out.println("Enter elements of first array :");
             obj.input(n1,a);
             System.out.println("Enter elements of second array :");
             obj.input(n1,b);
             for(int i=0;i<n1;i++)
             {
               if( a[i]!=b[i])
               {
                 error=1;
               }
             }
             if(error == 1)
             {
              System.out.println("not same");
             }
             else
             {
               System.out.println("same");
             }
        
         
       }
         else
        {
           System.out.println("not same");
        }
  }
  
  void input(int n,int a[])
  {
     Scanner ob = new Scanner(System.in);
    
     for(int i=0;i<n;i++)
     {
         a[i] = ob.nextInt();
     }
    }
    
}
