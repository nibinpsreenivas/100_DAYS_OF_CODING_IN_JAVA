import java.util.*;

class ans12
{

  public static void main(String args[])
  {
    ans12 obj = new ans12();
    Scanner ob = new Scanner(System.in);
    System.out.println("Input:");
    int a = ob.nextInt();
    int sum=0;
     while(a!=0)
     {
       sum=sum+a%10;
       a=a/10;
      
     }
    System.out.println("OUTPUT:"+sum);
   
  }

}

   
