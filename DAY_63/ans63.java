import java.util.*;
class ans63
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
       
        System.out.println("enter w1");
        int w1 = obj.nextInt();
        
        System.out.println("enter w2");
        int w2 = obj.nextInt();
        
        System.out.println("enter x1");
        int x1 = obj.nextInt();
        
        System.out.println("enter x2");
        int x2 = obj.nextInt();
        
        System.out.println("enter m");
        int m = obj.nextInt();
        
        int n1=w2-w1;
        int x11 =x1*m;
        int x22 =x2*m;
        if(n1>=x11 && n1<=x22)
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
     System.out.print(arr2[i]+" ");
   }
  }
}
