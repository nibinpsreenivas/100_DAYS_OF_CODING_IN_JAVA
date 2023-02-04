import java.util.*;
class ans65
{
 
  public static void main(String[] args) 
   {
      Scanner obj = new Scanner(System.in);
      System.out.println("enter the test condition");
      int n = obj.nextInt();
      int l=n;
      int arr2[] = new int[n];
      int j=0;
      int c1=0,c0=0;
      int area=0,farea=0;
      while(n!=0)
      {
        int tabno = obj.nextInt();
        int money = obj.nextInt();
        farea=0;
        for(int i=0;i<tabno;i++)
        {
          
                 
          int arr1[] = new int[3];
          System.out.println("enter the h");
          arr1[0]= obj.nextInt();
          
          System.out.println("enter the w");
          arr1[1]= obj.nextInt();
          
          System.out.println("enter the p");
          arr1[2]= obj.nextInt();
          
           if(arr1[2]>money)
           {
             area=-1;
           }
           else
           {

             area=arr1[0]*arr1[1];
           }
        if(farea<area)
        {
         farea=area;
        }
      }
      if(farea!=0)
      {
        arr2[j++]=farea;
      }
      else
      {
         arr2[j++]=0;
      }
       n=n-1;
    }
   System.out.println("output");
   for(int i=0;i<l;i++)
   {
     if(arr2[i]==0)
     {
       System.out.println("no tablet");
     }
     else
     {
       System.out.println(arr2[i]);
     }
   }
  }
}
