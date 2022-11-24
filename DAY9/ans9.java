import java.util.*;

class ans9
{

  public static void main(String args[])
  {
    ans9 obj = new ans9();
    Scanner ob = new Scanner(System.in);
    System.out.println("Input: ");
    int x = ob.nextInt();
    int count=0;
     while(x!=0)
     {
       x=x/10;
       count++;
     }   
   System.out.println("output: "+count);
    
   }

}

   
