import java.util.*;
import java.lang.*;
import java.io.*;
class ans70
{
 
 public static void main (String[] args) throws java.lang.Exception
 {
   BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Sample Input 1");
   int 	n = Integer.parseInt(b.readLine().trim());
   String[] input = b.readLine().split(" ");
   int a[] = new int[n];
   for(int i=0;i<n;i++)
   {
     a[i] = Integer.parseInt(input[i]);
     
   }
  
   ans70 obj = new ans70();
   obj.rotate(n,a);
 
  }
  void rotate(int n,int a[])
  {
    int last=a[n-1];
    for(int i=n-2;i>-1;i--)
    {
      a[i+1]=a[i];
    }
    a[0]=last;
    System.out.println("");
    for(int i=0;i<n;i++)
    {
       System.out.print(a[i]+" , ");
    }
  }
}
