import java.util.*;
import java.io.*;
import java.lang.*;

class ans32
{

  public static void main(String args[])
  {
     ans32 obj = new ans32();
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
           if(s1[i]=='A' || s1[i] =='a')
           {
               k=1;
           }
           else if(s1[i]=='E' || s1[i] =='e')
           {
               k=1;
               
           }
           else if(s1[i]=='I' || s1[i] =='i')
           {
               k=1;
               
           }
           else if(s1[i]=='O' || s1[i] =='o')
           {
               
               k=1;
           }
           else if(s1[i]=='U' || s1[i] =='u')
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


   
