import java.util.*;

class ans14
{

  public static void main(String args[])
  {
    ans14 obj = new ans14();
    Scanner ob = new Scanner(System.in);
    System.out.println("Input:");
    int a = ob.nextInt();
    int sum=0;
    int d;
     while(a!=0)
     {
        d=a%10;
       sum=sum*10+d;
        a=a/10;
     }
    System.out.println("OUTPUT:"+sum);
   
  }

}

   
