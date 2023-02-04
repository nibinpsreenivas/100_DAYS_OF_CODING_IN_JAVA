import java.util.*;
class ans61
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
        int arr1[] = new int[2];
        pow=0;
        System.out.println("enter the a size");
        arr1[0] = obj.nextInt();
        
        System.out.println("enter the b SIZE");
        arr1[1] = obj.nextInt();
        
        int res=arr1[0]+arr1[1];
        
        arr2[j++]=res; 
        n=n-1;
      }
   System.out.println("output");
   for(int i=0;i<l;i++)
   {
     if(arr2[i]<3)
     {
       System.out.println("1");
     }
     else if(arr2[i]>=3 && arr2[i]<=10)
     {
       System.out.println("2");
     }
     else if(arr2[i]>=11 && arr2[i]<=60)
     {
       System.out.println("3");
     }
     else if(arr2[i]>60)
     {
       System.out.println("4");
     }
   }
  }
}
