import java.util.*;
import java.lang.*;
import java.io.*;
class ans67
{
 
 public static void main (String[] args) throws java.lang.Exception
 {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Sample Input 1");
   int t = Integer.parseInt(br.readLine().trim());
   int i=1;
   int a[] = new int[t];
   int k=0;
  
   do
   {
     String[] input = br.readLine().split(" ");
     System.out.println("");
     int s = Integer.parseInt(input[0]);
     int b1 = Integer.parseInt(input[1]);
     int b2 = Integer.parseInt(input[2]);
     int b3 = Integer.parseInt(input[3]);
    
     for(i=1;s<=(b1+b2+b3);i++)
     {
        s=s*i;
     }
     t--;
     a[k++]=i-1;
      
   }while(t-->-1);
   System.out.println("Sample Output 1");
   for(i=0;i<a.length;i++)
   {
      System.out.println("");
      System.out.println(a[i]);
   }  
    
 
 }
}
