import java.util.*;
import java.lang.*;
import java.io.*;


class Isosceles
{
  void printi()
  {
   System.out.print("I am an isosceles triangle");
  }
}

class Equilateral extends Isosceles
{
 
 void printe() 
 {
   
  System.out.println("I am an equilateral triangle");
 
 }
 
}
class triangle extends Equilateral
{
  void printt()
  {
   System.out.print("  I am a triangle");
  }
}   
class ans69
{
  public static void main(String args[])
  {
    triangle t= new triangle();
    t.printe();
    t.printi();
    t.printt();
  }
}
    
    
   
   
   
   
