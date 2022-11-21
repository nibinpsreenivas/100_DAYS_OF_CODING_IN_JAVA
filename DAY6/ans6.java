import java.util.*;

class ans6
{
  
  public static void main(String args[])
  {
    ans6 obj = new ans6();
    Scanner ob = new Scanner(System.in);
    System.out.println("enter the x quadrant");
    int x = ob.nextInt();
    System.out.println("enter the y quadrant");
    int y = ob.nextInt();
    if(x>0 && y>0)
    {
      System.out.println("This point lies in first quadrant.");
    
    }
    else if(x<0 && y>0)
    {
      System.out.println("This point lies in second quadrant.");
    
    }
    else if(x<0 && y<0)
    {
      System.out.println("This point lies in third quadrant.");
    
    }
    else if(x>0 && y<0)
    {
      System.out.println("This point lies in fourth quadrant.");
    
    }
   
  }

}
   
