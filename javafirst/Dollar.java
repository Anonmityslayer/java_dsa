import java.util.Scanner;

public class Dollar
  {
    public static void main(String[] args)
    {
      System.out.println("enter the amount in INR ");
      Scanner input = new Scanner(System.in);
      double inr = input.nextDouble();
      System.out.println("enter the rate off conversion ");
      double rate = input.nextDouble();
      System.out.println("USD " + rate + "@rate of is =="+  inr /rate);
      }
  }

