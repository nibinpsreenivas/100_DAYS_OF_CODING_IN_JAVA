import java.util.*;
import java.io.*;
import java.lang.*;

class ans36
{

  public static void main(String args[])
  {
     ans36 obj = new ans36();
     Scanner ob = new Scanner(System.in);
         System.out.println("Input string:");
         
         String s = ob.nextLine();
         char temp;
         char s1[]= s.toCharArray();
         int i=0;
         
               temp= Character.toUpperCase(s1[0]);
               s1[0]=temp;
          
               
               temp= Character.toUpperCase(s1[(s1.length-1)]);
               s1[(s1.length-1)]=temp;
          
        while(i<s1.length)
        {
           System.out.print(s1[i]);
           i=i+1;
        }
  }
    
        
}
