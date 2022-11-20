import java.util.*;

class ans4
{
  
  public static void main(String args[])
  {
    ans4 obj = new ans4();
    Scanner ob = new Scanner(System.in);
    System.out.println("enter the input to identify the number is positive or negative");
    int a = ob.nextInt();
    if(a>0)
    {
      System.out.println("Positive number");
    
    }
    else if(a==0)
    {
      System.out.println("Neither positive nor negative");
    
    }
   else if(a<0)
    {
      System.out.println(" Negative number");
    
    }
   
  }

}
   
