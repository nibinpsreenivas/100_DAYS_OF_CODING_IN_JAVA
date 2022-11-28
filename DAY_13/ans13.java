import java.util.*;

class ans13
{

  public static void main(String args[])
  {
    ans13 obj = new ans13();
    Scanner ob = new Scanner(System.in);
    System.out.println("Input:");
    int a = ob.nextInt();
    int sum=0;
     while(a!=0)
     {
       sum=sum+a;
       a--;
     }
    System.out.println("OUTPUT:"+sum);
   
  }

}

   
