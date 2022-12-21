import java.util.*;
import java.io.*;
import java.lang.*;

class ans35
{

  public static void main(String args[])
  {
     ans35 obj = new ans35();
     Scanner ob = new Scanner(System.in);
         System.out.println("Input string:");
         
         String s = ob.nextLine();
         char temp;
         char s1[]= s.toCharArray();
         int r=s1.length;
         int j=0;
         int s2[] = new int[r];
         int i=0;
         
         int sum =0;
         while(i<s1.length)
         {
           int k=0; 
           if(s1[i]=='1')
           {
               s2[j]=1;
               j=j+1;
           }
           else if(s1[i]=='2')
           {
              s2[j]=2;
               j=j+1;
           }
           else if(s1[i]=='3')
           {
              s2[j]=3;
               j=j+1;
           }
           else if(s1[i]=='4')
           {
              s2[j]=4;
               j=j+1;
           }
           else if(s1[i]=='5')
           {
              s2[j]=5;
               j=j+1;
           }
           else if(s1[i]=='6')
           {
              s2[j]=6;
               j=j+1;
           }
           else if(s1[i]=='7')
           {
              s2[j]=7;
               j=j+1;
           }
           else if(s1[i]=='8')
           {
              s2[j]=8;
               j=j+1;
           }
           else if(s1[i]=='9')
           {
              s2[j]=9;
               j=j+1;
           }
           else if(s1[i]=='0')
           {
              s2[j]=0;
               j=j+1;
           }
           i=i+1;
        }
        i=0;
        while(i<s2.length)
        {
           sum = sum+s2[i];
           i=i+1;
        }
        System.out.println(sum);
  }
    
        
}


   
