import java.util.*;

class ans10
{

  public static void main(String args[])
  {
    ans10 obj = new ans10();
    Scanner ob = new Scanner(System.in);
    System.out.println("number from user for which you need to find the factorial");
    int a = ob.nextInt();
    int fact=1;
    for(int i=1;i<=a;i++)
    {
      fact = fact*i;
    }
           
   System.out.println("factorial is:"+fact);
    
   }

}

   
