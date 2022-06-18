import java.util.Scanner;

public class Fibonacci
  {
    public static void main(String[] args)
    {
      System.out.print("enter the number of terms in the fibonacci sequence :");
      Scanner input = new Scanner(System.in);
      int terms = input.nextInt(); 

      int n = 1;
      int m = 2;
      for (int i =0 ; i < terms ; i++ )
        {
          if( i <= 1 )
          {
            System.out.print(i+1 + " ");
          }
          else
          {
            int q = m+n;
            System.out.print(q + " ");
            n = m;
            m = q;
          }
        }
      System.out.println();
    }
  }