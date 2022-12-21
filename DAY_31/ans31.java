import java.util.*;
import java.io.*;
import java.lang.*;

class ans31
{

  public static void main(String args[])
  {
     ans31 obj = new ans31();
     Scanner ob = new Scanner(System.in);
         System.out.println("Input string:");
         
         String s = ob.nextLine();
         char temp;
         char s1[]= s.toCharArray();
         int i=0;
         while(i<s1.length)
         {
           if((int)s1[i]>=65 && (int)s1[i]<=90)
           {
               temp= Character.toLowerCase(s1[i]);
               s1[i]=temp;
           }
           else if((int)s1[i]>=98 && (int)s1[i]<=122)
           {
               
               temp= Character.toUpperCase(s1[i]);
               s1[i]=temp;
           }
         i=i+1;
        }
        i=0;
        while(i<s1.length)
        {
           System.out.print(s1[i]);
           i=i+1;
        }
  }
    
        
}


   
