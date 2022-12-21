import java.util.*;
import java.io.*;
import java.lang.*;

class ans33
{
   
  public static void main(String args[])
  {
     ans33 obj = new ans33();
     Scanner ob = new Scanner(System.in);
         System.out.println("Input string:");
         int k=1;
         String s = ob.nextLine();
         char temp;
         char s1[]= s.toCharArray();
         int r=s1.length;
         int j=r;
         char s2[] = new char[r];
         int i=0;
         s2[j-1]='\0';
         j--;
         
         while(i<s1.length)
         {
           s2[j]=s1[i];
           i=i+1;
           j=j-1;
           
         }
        i=0;
       
        while(i<s1.length)
        {
            if(s2[i]!=s1[i])
            {
              k=0;
            }
            i=i+1;
        }
       
        
        if(k==0)
        {
          System.out.println("Not a Palindrome");
        }
        else
        {
          System.out.println("Palindrome");
        }
        
  }
    
        
}


   
