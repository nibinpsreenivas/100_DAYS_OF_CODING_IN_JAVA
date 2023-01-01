import java.util.*;
import java.io.*;
import java.lang.*;

class ans46
{

  public static void main(String args[])
  {
     ans46 obj = new ans46();
     Scanner ob = new Scanner(System.in);
         System.out.println("Enter the size of array :");
         int n1 = ob.nextInt();
         
             int a[] = new int[n1];
             int small=0,lar=0;
             System.out.println("Enter elements");
             obj.input(n1,a);
            
            int sum=0;
            for(int i=0;i<n1;i++)
            {
               sum=sum+a[i];
            }
            
            
         System.out.println("output :"+sum);
         
         
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
