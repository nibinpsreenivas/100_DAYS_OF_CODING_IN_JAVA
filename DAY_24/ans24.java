import java.util.*;

class ans24
{

  public static void main(String args[])
  {
    ans24 obj = new ans24();
    Scanner ob = new Scanner(System.in);
    System.out.println("Input:");
       int a = ob.nextInt();
       int isodd =0;
       int odd=0;
       int temp;
       for(int i=0;i<a;i++)
       {
         
          while(isodd%2==0)
          {
            isodd=isodd+1;
          }
           temp=isodd;
          
            odd=odd-1;
          while(temp!=0)
          {
           
            temp=temp-1;
          }
          
          isodd=isodd+1;
      }
      odd=isodd-1;
      isodd=0;
      temp=0;
      
       odd=odd/2;
       for(int i=0;i<a;i++)
       {
         
          while(isodd%2==0)
          {
            isodd=isodd+1;
          }
          temp=isodd;
          for(int k=0;k<odd;k++)
           {
             System.out.print(" ");
           }
            odd=odd-1;
          while(temp!=0)
          {
            System.out.print("*");
            temp=temp-1;
          }
          System.out.println("");
          isodd=isodd+1;
      }
        
        
    }
        
}


   
