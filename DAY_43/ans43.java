import java.util.*;
import java.io.*;
import java.lang.*;

class ans43
{

  public static void main(String args[])
  {
     ans43 obj = new ans43();
     Scanner ob = new Scanner(System.in);
         System.out.println("Enter the size of array :");
         int n1 = ob.nextInt();
         
             int a[] = new int[n1];
             int error=-1;
             System.out.println("Enter elements");
             obj.input(n1,a);
             error = obj.checker(n1,a);
             
             
             if(error == 1)
             {
              System.out.println("odd");
             }
             else if(error == 2)
             {
               System.out.println("mixed");
             }
             else if(error ==0)
             {
                System.out.println("even");
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
  int checker(int n,int a[])
  {
    String count="nothing"; 
             for(int i=0;i<n;i++)
             {
               if(a[i]%2==0)
               {
                 if(count!="odd")
                 {
                  count="even";
                 }
                 else
                 {
                   return 2;
                 }
               }
               else 
               {
                 if(count!="even")
                 {
                  count="odd";
                 }
                 else
                 {
                   return 2;
                 }
               }
              }
              if(count=="odd")
              {
                return 1;
              }
              else
              {
                 return 0;
              }
              
               
     }
     
}
