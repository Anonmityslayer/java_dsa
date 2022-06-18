import java.util.Scanner;

public class Armstrong
  {
    public static void main(String[] args)
    {
      System.out.println("enter two numbers");
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m = in.nextInt();
      Integer numm = 0;
      int count = 0;
      for(int i=n ; i < m; i++)
        {
          int q = i;
          while(q > 0)
            {
              int z = i % 10;
              numm = numm + q*q*q ;  
              q = i / 10;
            }
          if (numm.equals(n))
          {
            count++;
            System.out.print(numm);
          }
        }
    }
  }