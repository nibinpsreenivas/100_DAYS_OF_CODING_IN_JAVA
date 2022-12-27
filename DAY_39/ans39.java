import java.util.*;
import java.io.*;
import java.lang.*;

class ans39
{

  public static void main(String args[])
  {
     ans39 obj = new ans39();
     Scanner ob = new Scanner(System.in);
         System.out.println("Input string:");
         
         String s = ob.nextLine();
         String ss = ob.nextLine();
         char s1[]= s.toCharArray();
         char s2[]= ss.toCharArray();
         int count=0;
         int k=0;
         int key=0;
         char temp;
         int len = s.length();
         
         if(s.length()==ss.length())
         {
              for(int i=0;i<s.length();i++)
              {
                
                 temp=s1[i];
                 for(k=0;k<len;k++)
                 {
                    if(s2[k]== temp)
                    {
                      for(int j =k;j<len;j++)
                      {
                        if(j<len-1)
                        {
                           s2[j] = s2[j+1];
                        }
                      }
                      len=len-1;
                      break;
                     }
                  }
                
                  
               }
               
                 if(len == 0)
                 {
                  System.out.println("Anagram");
                 }
                 else
                 {
                   System.out.println("not Anagram");
                 }
            }
                    
    else
    {
      System.out.println("not Anagram");
    }
 }
    
}
