import java.util.Scanner;

public class Pallindrome
  {
    public static void main(String[] args)
    {
      System.out.println("enter the number ");
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int new_num = 0 ;
      Integer q = num; 
      while (num > 0)
        {
          int z = num % 10;
          new_num = new_num * 10 + z ;
          num = num/10;  
        }

      System.out.println(new_num);
      if ( q.equals(new_num))
      {
        System.out.println("number is pallindrome");
      }
      else
      {
        System.out.println("not a pallindrome");
      }
    }
  }