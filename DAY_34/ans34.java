
import java.util.*;
import java.io.*;
import java.lang.*;
class ans34
{
public static void main(String args[])
{
       ans34 obj = new ans34();
       Scanner ob = new Scanner(System.in);
       System.out.println("Input string:");
       String s = ob.nextLine();
       char temp;
       char s1[]= s.toCharArray();
       int r=s1.length;
       int j=0;
       char s2[] = new char[r];
       int i=0;
           while(i<s1.length)
           {
               int k=0;
              if(s1[i]=='(' || s1[i] ==')')
              {
                 k=1;
               }
              else if(s1[i]=='{' || s1[i] =='}')
              {
                k=1;
               }
             else if(s1[i]=='[' || s1[i] ==']')
              {
                     k=1;
              }
            if(k==0)
            {
               s2[j]=s1[i];
                  j=j+1;
             }
            i=i+1;
          }
        i=0;
        while(i<s2.length)
        {
          System.out.print(s2[i]);
              i=i+1;
       }
    }
}
