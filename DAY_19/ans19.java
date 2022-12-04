import java.util.*;

class ans19
{

  public static void main(String args[])
  {
    ans19 obj = new ans19();
    Scanner ob = new Scanner(System.in);
    System.out.println("Input:");
       int a = ob.nextInt();
       int temp=a;
       int count =0;
       int d=0;
       int sum=0;
       while(a!=0)
       {
         a=a/10;
         count++;
       }
       a=temp;
       while(a!=0)
       {
          d=a%10;
          a=a/10;
          sum=sum + (int)Math.pow(d,count);
       }
          if(temp==sum)
           {
               System.out.println("Armstrong number");
           }
          else
          {
              System.out.println("Not an Armstrong number");
          }
    }
    
}

   
