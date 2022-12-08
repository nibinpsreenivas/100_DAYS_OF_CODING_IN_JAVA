import java.util.*;

class ans22
{

  public static void main(String args[])
  {
    ans22 obj = new ans22();
    Scanner ob = new Scanner(System.in);
    System.out.println("Input:");
       int a = ob.nextInt();
       int l=-1,r=-1;
      for(int i =2;i<a;i++)
      {
        if(obj.checkprime(i)==1)
        {
          if(obj.checkprime(a-i)==1)
          {
              r=i;
              l=a-i;
           }
        }
      }
      if(l==-1 && r==-1)
      {
         System.out.println(a+" cannot be expressed as sum of prime number");
      }
      else 
      {
         System.out.println(a+" can be expressed as sum "+l+" and "+r);
      }
       
    }
   int checkprime(int n)
   {
       if(n==1)
       {
         return 0;
       }
       for(int i=2;i<n;i++)
       {
          if(n%i==0)
          {
             return 0;
          }
       }
       return 1;
    }   
             
}


   
