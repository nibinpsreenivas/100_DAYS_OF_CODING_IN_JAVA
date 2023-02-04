import java.util.*;
class ans57
{
 
  public static void main(String[] args) 
   {
      Scanner obj = new Scanner(System.in);
      System.out.println("enter the test condition");
      int n = obj.nextInt();
      int l=n*2;
      int arr2[] = new int[l];
      int j=0;
      while(n!=0)
      {
        int arr1[] = new int[3];
        System.out.println("enter the total question");
        arr1[0] = obj.nextInt();
        
        System.out.println("enter the correct answer");
        arr1[1] = obj.nextInt();
        
        System.out.println("enter the passing mark");
        arr1[2] = obj.nextInt();
        
        int wrong=arr1[0]-arr1[1];
        int total=arr1[1]*3-wrong;
        arr2[j++]=total;
        arr2[j++]=arr1[2];
        n=n-1;

   }
   System.out.println("output");
   for(int i=0;i<l;i=i+2)
   {
     if(arr2[i]>=arr2[i+1])
        {
          System.out.println("PASS");
        }
        else
        {
          System.out.println("FAIL");
        }
   }
  }
}
