import java.util.*;
class ans64
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
       
        System.out.println("enter FEED BACK");
        
        String s1 = obj.next();
        
       
        if(s1.contains("101")||s1.contains("010"))
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
       System.out.println("Good");
     }
     else
     {
        System.out.println("Bad");
     }
   }
  }
}
