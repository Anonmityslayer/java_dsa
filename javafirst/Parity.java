import java.util.Scanner;

public class Parity
  {
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.println ("enter the number");
    int num = input.nextInt();
    if (num % 2 == 0)
    {
      System.out.println("even number");
    }
    else 
    {
      System.out.println("odd number");
    }
    }
  }
