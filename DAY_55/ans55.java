import java.util.*;
class ans55
{
 
  public static void main(String[] args) 
   {
      Scanner obj = new Scanner(System.in);
      System.out.println("enter number of elements in arr1");
      int n = obj.nextInt();
      int arr1[] = new int[n];
      System.out.println("enter elements of arr");
      for(int i = 0 ; i<n ; i++)
      {
        arr1[i] = obj.nextInt();
      }
      
      
      int arr2[] = new int[n];
      System.out.println("enter elements of arr2");
      for(int i = 0 ; i<n ; i++)
      {
        arr2[i] = obj.nextInt();
      }
    
      
      int sum=0;
     for (int i = 0; i < n; i++)
     {
        sum=sum+(arr1[i]*arr2[i]);
     }
  
        System.out.print("output :"+sum);

   }
 }
