import java.util.Scanner; 

public class ans8  
{  
    
      public static void main(String[] Strings)   
      {  
            Scanner input = new Scanner(System.in);  
            System.out.print("Enter the value of a, b and c :");  
            double a = input.nextDouble();double b = input.nextDouble(); double c = input.nextDouble();  
            double d= b * b - 4.0 * a * c;  
            if (d> 0.0)   
            {  
                 double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
                 double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
                 System.out.println("The roots are " + r1 + " and " + r2);  
            }   
            else if (d == 0.0)   
           {  
                double r1 = -b / (2.0 * a);  
                System.out.println("Roots are equal");  
                System.out.println("Root 1= root 2 =" + r1);  
           }   
           else   
           {  
                System.out.println("Roots are not real.");  
           }  
      }  
}  

   
