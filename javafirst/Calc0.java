import java.util.Scanner;

public class Calc0
{
  public static void main(String[] args)
  {
    System.out.println("enter the numbers");
    Scanner input = new Scanner(System.in);
    float num = input.nextFloat();
    float nem = input.nextFloat();
    System.out.println("enter the operator");
    float res = 0;
    char opr;
    while(true)
    { 
    String opr1 = input.next();
      opr = opr1.charAt(0);
      if (opr == '+' || opr == '-' || opr == '*' || opr == '/' || opr == '%')
      {
        break;
      }
      else 
      {
        System.out.println("enter the correct operator like +,-,*,/,% ");
      }
      
    }

    switch (opr) 
      {
      case '+' :
        {
          res = num + nem;
          System.out.println(res);
          break;
        }
        case '-' :
          {
          res = num - nem;
          System.out.println(res);
            break;
        }

        case '*' :
          {
          res = num * nem;
          System.out.println(res);
            break;
        }
        case '/' :
        {
          res = num / nem;
          System.out.println(res);
          break;
        }

        case '%' :
        {
          res = num % nem;
          System.out.println(res);
          break;
        }
      }
  }
}