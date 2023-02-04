import java.util.*;
class ans59
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
        System.out.println("enter the M size");
        arr1[0] = obj.nextInt();
        
        System.out.println("enter the H SIZE");
        arr1[1] = obj.nextInt();
        for(int u=0;u<arr1[1];u++)
        {
          pow=pow+arr1[1];
        }
        int BMI=arr1[0]/pow;
        
        arr2[j++]=BMI; 
        n=n-1;
      }
   System.out.println("output");
   for(int i=0;i<l;i++)
   {
     if(arr2[i]<=18)
     {
       System.out.println("1");
     }
     else if(arr2[i]>18 && arr2[i]<=24)
     {
       System.out.println("2");
     }
     else if(arr2[i]>24 && arr2[i]<=29)
     {
       System.out.println("3");
     }
     else if(arr2[i]>=30)
     {
       System.out.println("4");
     }
   }
  }
}
