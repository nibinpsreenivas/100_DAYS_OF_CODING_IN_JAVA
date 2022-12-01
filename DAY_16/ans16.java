import java.util.*;

class ans16
{

  public static void main(String args[])
  {
    ans16 obj = new ans16();
    Scanner ob = new Scanner(System.in);
    System.out.println("Input:");
    int a = ob.nextInt();
    int sum=0;
    int d;
    int temp=a;
    for(int i=1;i<a;i++)
    {
       if(a%i==0)
       {
         sum=sum+i;
        }
     }
     if(sum==temp)
     {
         System.out.println("Perfect Number");
     }
     else
     {
         System.out.println("Not a Perfect Number");
     }
     
   
  }
  
}

   
