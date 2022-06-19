import java.util.Scanner;

public class Greet
{
  public static void main(String[] args)
  {
    System.out.println("enter your name");
    Scanner input = new Scanner(System.in);
    String name = input.next();
    System.out.println("hello " + name );
  }
}