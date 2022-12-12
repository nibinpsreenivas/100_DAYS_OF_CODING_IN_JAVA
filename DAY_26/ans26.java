import java.util.*;

class ans26
{

  public static void main(String args[])
  {
    ans26 obj = new ans26();
    Scanner ob = new Scanner(System.in);
       System.out.println("Input:");
         int a = ob.nextInt();
         int ans=obj.handshake(a);
       System.out.println("output:"+ans);
        
    }
  int handshake(int a)
  {
    int sum =0,r=1;
      while(a!=r)
      {
        sum=sum+a-r;
        r=r+1;
      }
      return sum;
  } 
        
}


   
