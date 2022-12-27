import java.util.*;
import java.io.*;
import java.lang.*;

class ans41
{

  public static void main(String args[])
  {
     ans41 obj = new ans41();
     Scanner ob = new Scanner(System.in);
         System.out.println("Input string:");
         
         String s = ob.nextLine();
         String ss = ob.nextLine();
         char s1[]= s.toCharArray();
         char s2[]= ss.toCharArray();
         int count=0;
         
        
         
         if(s.length()==ss.length())
         {
              for(int i=0;i<s.length();i++)
              {
                
                 if(s1[i]==s2[i])
                 {
                    count=count+1;
                    
                 }
                 else if( s1[i]=='?'|| s1[i]=='*')
                 {
                    count=count+1;
                    
                 }
                 else if( s2[i]=='?'|| s2[i]=='*')
                 {
                    count=count+1;
                    
                 }
              }
               System.out.println(count);
                 if(count == s.length())
                 {
                  System.out.println("Yes they match");
                 }
                 else
                 {
                   System.out.println("no they dont  match");
                 }
            }
         else
        {
           System.out.println("no they dont  match");
        }
 }
    
}
