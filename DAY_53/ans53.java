import java.util.*;
class ans53
{
 
  public static void main(String[] args) 
   {
      Scanner obj = new Scanner(System.in);
      int n = obj.nextInt();
      int arr[] = new int[n];
    
      for(int i = 0 ; i<n ; i++)
      {
        arr[i] = obj.nextInt();
      }
      int ans = arr[0];
     for (int i = 0; i < n; i++)
     {
        int p = arr[i];
        for (int j = i + 1; j < n; j++)
        {
           ans = Math.max(ans,p);
           p =p * arr[j];
        }
        ans = Math.max(ans,p);
     }
    System.out.print("output: "+ans);
   }
 }
