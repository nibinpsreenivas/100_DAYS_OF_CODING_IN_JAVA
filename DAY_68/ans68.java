import java.util.*;
import java.lang.*;
import java.io.*;
class ans68
{
 
 public static void main (String[] args) throws java.lang.Exception
 {
   BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Sample Input 1");
   int t = Integer.parseInt(b.readLine().trim());
   int i=1;
   int a[] = new int[100];
   int y[] = new int[t];
   int k=0,m=0;
   int set=0;
  
   do
   {
     String[] input = b.readLine().split(" ");
     System.out.println("");
     int q = Integer.parseInt(input[0]);
     int n = Integer.parseInt(input[1]);
     switch(q)
     {
       case 1:a[k++]=n;
              break;
       case 2:for(i=0;i<k;i++)
              {
                 if(a[i]==n)
                 {
                   for(int h=i;h<k-1;h++)
                   {
                     a[h]=a[h+1];
                   }
                   break;
                 }
              }
              break;
       case 3:set=0;
              for(i=0;i<k;i++)
              {
                 if(a[i]==n)
                 {
                   set=1;
                   
                 }
              }
              if(set==0)
              {
                y[m++]=0;
              }
              else
              {
                y[m++]=1;
              }
              break;
     }
      t--;
   }while(t!=0);
   System.out.println("Sample Output 1");
   for(i=0;i<m;i++)
   {
      System.out.println("");
      if(y[i]==0)
      {
       System.out.println("NO");
      }
      else
      {
       System.out.println("YES");
      }
   }  
    
 
  }
 
}
