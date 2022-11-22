import java.util.*;

class ans7
{
 static boolean checkYear(int year)
    {
       
        if (year % 400 == 0)
            return true;
     
        
        if (year % 100 == 0)
            return false;
     
       
        if (year % 4 == 0)
            return true;
        return false;
    }
  public static void main(String args[])
  {
    ans7 obj = new ans7();
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter month : ");
    int m = ob.nextInt();
    boolean w;
    System.out.println("Enter year ");
    int y = ob.nextInt();
    switch(m)
    {
      case 1:System.out.println("31");
             break;
      case 2: w=checkYear(y);
             if(w==true)
             {
               System.out.println("29");
             }
             else 
             {
              System.out.println("28");
             }
             break;
      
      case 3:System.out.println("31");
             break;
                
      case 4:System.out.println("30");
             break;
      
      case 5:System.out.println("31");
             break;
                
      case 6:System.out.println("30");
             break;
      
      case 7:System.out.println("31");
             break;
                
      case 8:System.out.println("31");
             break;
      
      case 9:System.out.println("30");
             break;
                
      case 10:System.out.println("31");
             break;
      
      case 11:System.out.println("30");
             break;
                
      case 12:System.out.println("31");
             break;
      
   
  }
 

}
}
   
