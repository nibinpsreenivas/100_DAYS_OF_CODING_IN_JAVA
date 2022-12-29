import java.util.*;
import java.io.*;
import java.lang.*;

class ans44
{

  public static void main(String args[])
  {
     ans44 obj = new ans44();
     Scanner ob = new Scanner(System.in);
         System.out.println("Enter the size of array :");
         int n1 = ob.nextInt();
         
             int a[] = new int[n1];
             int counte=0,counto=0;
             System.out.println("Enter elements");
             obj.input(n1,a);
            
             
            for(int i=0;i<n1;i++)
            {
               if(a[i]%2 == 0)
               { 
                 counte++;
               }
               else
               {
                 counto++;
               }
            }
            
         System.out.println("Number of even elements :");
         System.out.println(counte);
         System.out.println("Number of odd elements :");
         System.out.println(counto);
         
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
