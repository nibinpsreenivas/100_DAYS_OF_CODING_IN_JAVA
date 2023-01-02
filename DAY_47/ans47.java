import java.util.*;
import java.io.*;
import java.lang.*;

class ans47
{

  public static void main(String args[])
  {
     ans47 obj = new ans47();
     Scanner ob = new Scanner(System.in);
         System.out.println("Enter the size of array :");
         int n1 = ob.nextInt();
         int lar_pal=-1,y;
         int a[] = new int[n1];
         System.out.println("Enter elements");
         obj.input(n1,a);
         int i=0;   
            while(i<n1)
            {
              y= obj.pal_checker(n1,a[i]);
              if(y==1)
              {
                 if(a[i]>lar_pal)
                 {
                   lar_pal=a[i];
                 }
              }
              i=i+1;
            }  
         if(lar_pal!=-1)
         {
         System.out.println("output :"+lar_pal);
         }
         else
         {
            System.out.println("output : no pal");
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
  
  int pal_checker(int n,int a)
  {
   int sum=0;
   int temp=a;
    while(temp!=0)
    {
         sum = sum*10+(temp%10);
         temp=temp/10;
    }
    if(sum==a)
    {
      return 1;
     }
     else
     {
       return -2;
     }
  }
     
}
