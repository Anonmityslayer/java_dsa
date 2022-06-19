import java.util.Scanner;

public class Fibonacci
{
  public static void main(String[] args)
  {
    System.out.println("enter the first and second term of the fibonacci sequence to be generated also the nth term in sequence");
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int n = in.nextInt();

    for (int i = 3 ; i<=n ; i++)
      {
        int temp = b;
        b = a+b;
        a = temp;
      }
    System.out.println (n +"th term of the fibonacci seq. is = " + b);
  }
}