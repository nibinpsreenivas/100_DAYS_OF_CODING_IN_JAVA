import java.util.*;
import java.lang.*;
import java.io.*;
class ans71
{
 
 public static void main (String[] args) throws java.lang.Exception
 {
   BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Sample Input 1");
   int 	h = Integer.parseInt(b.readLine().trim());
  
   int s[]=new int[h];
     
     int k=0;
   while(h!=0)
   {
    
      int n = Integer.parseInt(b.readLine().trim());
      int a[] = new int[n];
      int set =0;
       String[] input = b.readLine().split(" ");
     for(int i=0;i<n;i++)
     {
     a[i] = Integer.parseInt(input[i]);
     }
     int c=0;
     for(int i=0;i<n;i++)
     {
        int ai =a[i];
        int counts=0;
        int countl=0;
        
        for(int j=0;j<n;j++)
        {
          if(i!=j)
          {
            if(a[j]<=ai)
            {
               counts++;
            }
            else if(a[j]>ai)
            {
               countl++;
            }
          }
         }
       
         if(counts>countl)
         {
           c++;
         }
         
      }
      s[k++]=c;
     h--;   
    }
    for(int i=0;i<k;i++)
    {
      System.out.println(s[i]);
    }
  } 
}
