import java.util.*;

class ans20
{

  public static void main(String args[])
  {
    ans20 obj = new ans20();
    Scanner ob = new Scanner(System.in);
    System.out.println("Input:");
       int a = ob.nextInt();
       int yes=0;
        for(int i=2;i<a;i++)
        {
         
           if(a%i==0)
           {
             System.out.println(i);
             yes=1;
           }
        } 
         if(a==1)
          {
            yes=1;
           
          }
        if(yes==0)
        {
           System.out.println(a+"is a prime number");
        }
        else
        {
           System.out.println(a+"is not a prime number");
        }
        
    }
}

   
