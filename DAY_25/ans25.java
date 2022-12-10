import java.util.*;

class ans25
{

  public static void main(String args[])
  {
    ans25 obj = new ans25();
    Scanner ob = new Scanner(System.in);
       System.out.println("Input:");
         float a = ob.nextFloat();
         double ans = obj.area(a);
       System.out.println("output:"+ans);
        
    }
  double area(float a)
  {
       return (a*a*3.14);
  }
        
}


   
