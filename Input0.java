import java.util.Scanner;

public class Input0
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);
    System.out.println("enter your name");
    String name = input.next();
    System.out.println("hello " + name);
  }
}