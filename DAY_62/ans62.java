import java.util.*;
class ans62
{
 
  public static void main(String[] args) 
   {
      Scanner obj = new Scanner(System.in);
      System.out.println("enter the test condition");
      int n = obj.nextInt();
      int l=n;
      int arr2[] = new int[n];
      int j=0;
      int pow=0;
      while(n!=0)
      {
        int arr1[] = new int[3];
        int res=0;
        System.out.println("enter the NUMBER OF PEOPLE");
        arr1[0] = obj.nextInt();
        arr1[0] = arr1[0]+1;
        
        System.out.println("enter the total kg");
        arr1[1] = obj.nextInt();
        
        System.out.println("enter the max kg");
        arr1[2] = obj.nextInt();
        
         res=arr1[0] * arr1[2];
          
        if(res>=arr1[1])
        {
          arr2[j++]=1;
        }
        else
        {
          arr2[j++]=0;
        }
        n=n-1;
      }
   System.out.println("output");
   for(int i=0;i<l;i++)
   {
     if(arr2[i]==1)
     {
       System.out.println("YES");
     }
     else if(arr2[i]==0)
     {
       System.out.println("NO");
     }
     
   }
  }
}
