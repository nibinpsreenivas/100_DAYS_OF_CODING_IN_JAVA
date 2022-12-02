import java.util.*;

class ans17
{

  public static void main(String args[])
  {
    ans17 obj = new ans17();
    Scanner ob = new Scanner(System.in);
    System.out.println("Input:");
    int a = ob.nextInt();
    for(int i=1;i<=a;i++)
    {
       if(a%i==0 && i!=a)
       {
         System.out.print(i+",");
        }
        else if(a%i==0)
        {
          System.out.print(i);
        }
     }
   
     
   
  }
  
}

   
