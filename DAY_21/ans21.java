import java.util.*;

class ans21
{

  public static void main(String args[])
  {
    ans21 obj = new ans21();
    Scanner ob = new Scanner(System.in);
    System.out.println("Input:");
       int a = ob.nextInt();
       int sum=0,d,temp;
       temp=a;
       while(a!=0)
       {
          d=a%10;
          sum = sum*10+d;
          a=a/10;
       }
        if(sum==temp)
        {
           System.out.println("Palindrome");
        }
        else
        {
           System.out.println("Not a Palindrome");
        }
        
    }
}

   
