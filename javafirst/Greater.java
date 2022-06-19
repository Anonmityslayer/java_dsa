import java.util.Scanner;

public class Greater
  {
    public static void main(String[] args)
    {
      System.out.println("enter the numbers to be compared");
      Scanner in = new Scanner(System.in);
      float num = in.nextFloat();
      float nem = in.nextFloat();
      if (num < nem)
      {
        System.out.println(nem + " is greater than " + num);
      }
      else
      {
        System.out.println(num + " is greater than " + nem);
      }
    }
  }