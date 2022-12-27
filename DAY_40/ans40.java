import java.util.*;
import java.io.*;
import java.lang.*;

class ans40
{

  public static void main(String args[])
  {
     ans40 obj = new ans40();
     Scanner ob = new Scanner(System.in);
           System.out.println("Enter a string");
           String s = ob.nextLine();
           
           System.out.println("Enter the substring to be removed :");
           String ss = ob.nextLine();
           
           System.out.println(" Enter the new substring :");
           String sss = ob.nextLine();
           
           String news =s.replace(ss,sss);
           System.out.println(news);
         
 }
    
}
