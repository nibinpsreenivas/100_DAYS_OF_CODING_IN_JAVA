import java.util.*;

class ans18
{

  public static void main(String args[])
  {
    ans18 obj = new ans18();
    Scanner ob = new Scanner(System.in);
    System.out.println("Input:");
       int x1 = ob.nextInt();
       int y1 = ob.nextInt();
       int x2 = ob.nextInt();
       int y2 = ob.nextInt();
       int x3 = (x1*y2) + (x2*y1);
       int y3 = (y1*y2);
       int y=1;
       for(int i=1;i<x3||i<y3;i++)
       {
         if(x3%i==0 && y3%i==0)
         {
           y=i;
         }
       }
       x3=x3/y;
       y3=y3/y;
    System.out.println(x3+"/"+y3);
   
  }
  
}

   
