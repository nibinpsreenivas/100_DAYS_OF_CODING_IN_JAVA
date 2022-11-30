import java.util.*;

class ans15
{

  public static void main(String args[])
  {
    ans15 obj = new ans15();
    Scanner ob = new Scanner(System.in);
    System.out.println("Input:");
    int a = ob.nextInt();
    int sum=0;
    int d;
    int temp=a;
     while(a!=0)
     {
        d=a%10;
       sum=sum+obj.fact(d);
        a=a/10;
     }
     if(sum==temp)
     {
         System.out.println("strong number");
     }
     else
     {
         System.out.println("Not a strong number");
     }
     
   
  }
  int fact(int a)
  {
     int fact=1;
    for(int i=1;i<=a;i++)
    {
      fact = fact*i;
    }
    return fact;
  }
}

   
