import java.util.*;
import java.io.*;
import java.lang.*;

class ans38
{

  public static void main(String args[])
  {
     ans38 obj = new ans38();
     Scanner ob = new Scanner(System.in);
         System.out.println("Input string:");
         
         String s = ob.nextLine();
         char s1[]= s.toCharArray();
         int count=0;
         int k=0;
         int key=0;
         char temp;
              for(int i=0;i<s.length();i++)
              {
                k=0;
                 temp=s1[i];
                 for(k=0;k<i;k++)
                 {
                    if(s1[k]== temp)
                    {
                      key=1;
                     }
                 }   
                 if(key == 0)
                 {
                  
                System.out.println(s1[i]);
               }
               
            }
                    
          
      }
    
}
