import java.util.*;
class ans56
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
      
    
      
      int lar=arr1[0];
     for(int i = 0; i < n; i++)
     {
        if(lar<arr1[i])
        {
          lar=arr1[i];
        }
     }
     int set=0;
     for(int i = 0; i < n; i++)
     {
        if(lar%arr1[i]!=0)
        {
          set=1;
        }
     }
     
     if(set==1)
     {
        System.out.print("no");
     }
     else
     {
        System.out.print("yes");
     }

   }
 }
