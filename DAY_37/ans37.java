import java.util.*;
import java.io.*;
import java.lang.*;

class ans37
{

  public static void main(String args[])
  {
     ans37 obj = new ans37();
     Scanner ob = new Scanner(System.in);
         System.out.println("Input string:");
         
         String s = ob.nextLine();
         char s1[]= s.toCharArray();
         obj.selection_sort(s1,s.length());
         int count=0;
         int key=0;
              for(int i=0,k=0;i<s.length();i++)
              {
                 key=0;
                 count=0;
                 if(i!=0)
                 {
                     if(s1[i]==s1[i-1])
                     {
                        key=1;
                     }
                 }
                 if(key == 0)
                 {
                  for(int y=0;y<=k;y++)
                  {
                     
                   for(int j=0;j<s.length();j++)
                   {
                      if(s1[i]==s1[j])
                      {
                        count++;
                      }
                   }
                   
                System.out.println("The frequency of "+s1[i]+" is "+count);
               }
               }else{
                     continue;}
            }
                    
          
      }
      void selection_sort(char s1[],int n)
      {
        int sm;
        char temp;
          for(int i=0;i<n;i++)
              {
                 
                 sm =(int)s1[i];
                   for(int j=0;j<n;j++)
                   {
                      if(sm<=(int)s1[j])
                      {
                        temp=s1[i];
                        s1[i]=s1[j];
                        s1[j]=temp;
                        sm=(int)s1[j];
                      }
                   }
                   
              
               }
       }
}
