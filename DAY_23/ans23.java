import java.util.*;

class ans23
{

  public static void main(String args[])
  {
    ans23 obj = new ans23();
    Scanner ob = new Scanner(System.in);
    System.out.println("Input:");
       int a = ob.nextInt();
       int d,sum=0; 
        while(a!=0)
        {
           d=a%10;
           if(d==0)
           {
             d=1;
           }
           sum=sum*10+d;
           a=a/10;
        }
        a=sum;
        sum=0;
        while(a!=0)
        {
           d=a%10;
          
           sum=sum*10+d;
           a=a/10;
        }
        System.out.println("output:"+sum);
        
        
    }
        
}


   
