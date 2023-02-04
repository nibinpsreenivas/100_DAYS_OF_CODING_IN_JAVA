import java.util.*;
class ans54
{
 
  public static void main(String[] args) 
   {
      Scanner obj = new Scanner(System.in);
      System.out.println("enter number of elements in arr1");
      int n = obj.nextInt();
      int arr1[] = new int[n];
      System.out.println("enter elements of arr1");
      for(int i = 0 ; i<n ; i++)
      {
        arr1[i] = obj.nextInt();
      }
      
      System.out.println("enter number of elements in arr2");
      int m = obj.nextInt();
      int arr2[] = new int[m];
      System.out.println("enter elements of arr1");
      for(int i = 0 ; i<m ; i++)
      {
        arr2[i] = obj.nextInt();
      }
    
      
      int dis=-1;
     for (int i = 0; i < n; i++)
     {
        int p = arr1[i];
        for (int j = 0; j < m; j++)
        {
          if(p==arr2[j])
          {
            dis=arr2[j];
          }
        }
       
     }
    if(dis==-1)
    {
     System.out.print("Disjoint");
    }
    else
    {
        System.out.print("Not disjoint. (" +dis+" is common)");
    }
   }
 }
