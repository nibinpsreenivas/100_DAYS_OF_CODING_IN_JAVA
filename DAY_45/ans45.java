import java.util.*;
import java.io.*;
import java.lang.*;

class ans45
{

  public static void main(String args[])
  {
     ans45 obj = new ans45();
     Scanner ob = new Scanner(System.in);
         System.out.println("Enter the size of array :");
         int n1 = ob.nextInt();
         
             int a[] = new int[n1];
             int small=0,lar=0;
             System.out.println("Enter elements");
             obj.input(n1,a);
            
             small=a[0];
             lar=a[0];
            for(int i=0;i<n1;i++)
            {
               if(small >= a[i])
               { 
                 small=a[i];
               }
              
            }
            for(int i=0;i<n1;i++)
            {
              if(lar <= a[i])
               { 
                 lar=a[i];
               }
            }
            
         System.out.println("Smallest Number :");
         System.out.println(small);
         System.out.println("Largest Number :");
         System.out.println(lar);
         
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
