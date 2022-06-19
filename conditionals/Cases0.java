import java.util.Scanner;

public class Cases0
{
  public static void main(String[] args)
  {
    System.out.println("enter the character of english alphabet");
    Scanner input = new Scanner(System.in);
    String alpha1 = input.next();
    char alpha = alpha1.charAt(0);
    while (!((65 <= alpha && alpha <=91) ||(alpha >=97 && alpha <=123) && (alpha1.length() == 1)))
      {
        System.out.println("please enter single character from english alphabet");
      alpha1 = input.next();
      alpha = alpha1.charAt(0);
      }
    if (65 <= alpha && alpha <=91)
    {
      System.out.println("uppercase letter");
    }
    else if (alpha >=97 && alpha <=123)
    {
      System.out.println("lowercase letter");
    }
    else    
    {
      System.out.println("wrong input");
    }
  }
}