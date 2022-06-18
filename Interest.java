import java.util.Scanner;

public class Interest
{ 
  public static void main(String[] args)
  {
    System.out.println("enter principle, rate, time in sequence");
    Scanner in = new Scanner(System.in);
    float p = in.nextFloat();
    float r = in.nextFloat();
    float t = in.nextFloat();

    double si = (p*r*t)/100;
    System.out.println("simple interest is " + si);
  }
    
  }