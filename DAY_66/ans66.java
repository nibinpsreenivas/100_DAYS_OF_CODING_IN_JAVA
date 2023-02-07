import java.util.*;
class ans66
{
 
  public static void main(String[] args) 
   {
      Scanner obj = new Scanner(System.in);
      System.out.println("enter the test condition");
      int n = obj.nextInt();
      int l=n;
      int arr2[] = new int[n];
      int yes=-1;
      int k=-1;
      while(n!=0)
      {
        yes=-1;
        String a = obj.next();
        String b = obj.next();
        char A[] = a.toCharArray();
        char B[] = b.toCharArray();
        for(int i=0;i<(a.length()-2);i++)
        {
          char s1=A[i];
          for(int j=0;j<(b.length()-2);j++)
          {
            if(s1==B[j])
            {
               yes=1;
            }
          }
         }
        if(yes==-1)
        {
           arr2[++k]=0;  
        }
        else
        {
           arr2[++k]=1;
         }
         n=n-1;
      }
   System.out.println("output");
   for(int i=0;i<l;i++)
   {
     if(arr2[i]==0)
     {
       System.out.println("NO");
     }
     else
     {
       System.out.println("YES");
     }
   }
  }
}
