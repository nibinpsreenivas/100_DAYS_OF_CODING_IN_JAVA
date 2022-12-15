import java.util.*;
import java.io.*;
import java.lang.*;

class ans30
{

  public static void main(String args[])
  {
     ans30 obj = new ans30();
     Scanner ob = new Scanner(System.in);
         System.out.println("Input string 1:");
         String s1 = ob.nextLine();
         
         char s[]= s1.toCharArray();
         int i=0;
        
        try {
              while(s[i]!='\0')
              {
                 i=i+1;
              }
         }catch(Exception e)
          {
              System.out.println("output:"+i);
          }
  }
    
        
}


   
