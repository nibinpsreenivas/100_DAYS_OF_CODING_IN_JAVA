import java.util.*;
class ans58
{
 
  public static void main(String[] args) 
   {
      Scanner obj = new Scanner(System.in);
      System.out.println("enter the test condition");
      int n = obj.nextInt();
      int l=n;
      int arr2[] = new int[n];
      int j=0;
      while(n!=0)
      {
        int arr1[] = new int[2];
        System.out.println("enter the max size");
        arr1[0] = obj.nextInt();
        
        System.out.println("enter the filled size");
        arr1[1] = obj.nextInt();
        
       
        
        arr2[j++]=arr1[0]-arr1[1]; 
        n=n-1;

   }
   System.out.println("output");
   for(int i=0;i<l;i++)
   {
     System.out.println(arr2[i]);
   }
  }
}
