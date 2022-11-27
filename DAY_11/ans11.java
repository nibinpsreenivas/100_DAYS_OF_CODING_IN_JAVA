import java.util.*;

class ans11
{

  public static void main(String args[])
  {
    ans11 obj = new ans11();
    Scanner ob = new Scanner(System.in);
    System.out.println("Input:");
    int a = ob.nextInt();
    int first =0;
    int second = 1;
    int f=0;
    System.out.print(first+",");
      System.out.print(second);
    for(int i=2;i<a;i++)
    {
      
      f = first+second;
      System.out.print(","+f);
      first=second;
      second=f;
      
    }
           
   
    
   }

}

   
