import java.util.Scanner;

public class Greatest0
{
  public static void main(String[] args)
  {
    System.out.println("enter the numbers");
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();

    int max = a;
    if ( b > max)
    {
      max = b;
    }
    if(c > max)
    {
      max = c;
    }

    System.out.println("greatest of all is " + max);
    // max = Math.max( c, Math.max(a,b)); 
    /* we can also use max() method under class Math present in java.lang package */

  }
}