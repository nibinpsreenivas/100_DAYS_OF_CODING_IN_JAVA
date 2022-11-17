import java.util.*;

class ans2
{
  
  public static void main(String args[])
  {
    ans2 obj = new ans2();
    Scanner ob = new Scanner(System.in);
    System.out.println("enter the input to check if it is Alphabet or not ");
    char a = ob.next().charAt(0);
       if((int)a>=97 && (int)a<=122 || (int)a>=65 && (int)a<=90)
       {
           System.out.println("Alphabet");
       }
      else
       {
          System.out.println("Not an alphabet");
       }
    
   }
 }
   
