import java.util.*;
class ans60
{
 
  public static void main(String[] args) 
   {
      Scanner obj = new Scanner(System.in);
      System.out.println("enter the test condition");
      int n = obj.nextInt();
      int l=n;
      int arr2[] = new int[n];
      int j=0;
      int c1=0,c0=0;
      while(n!=0)
      {
        int arr1[] = new int[7];
        for(int i=0;i<7;i++)
        {
          c0=0;
          c1=0;
           System.out.println("enter the "+i+"day");
           arr1[i]= obj.nextInt();
           if(arr1[i]==1)
           {
             c1++;
           }
           else
           {
             c0++;
           }
        }
        if(c1>c0)
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
     else
     {
       System.out.println("NO");
     }
   }
  }
}
