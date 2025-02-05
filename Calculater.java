import java.util.Scanner;
class Calculater
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Operator:");
      char sym = sc.next().charAt(0);
      System.out.println("Enter the A value:");
      int a = sc.nextInt();
      System.out.println("Enter the B value:");
      int b = sc.nextInt();
      switch(sym)
        {
          case '+':
            int add = a+b;
            System.out.println("The Addition of "+a+" and "+b+" is "+ add);
            break;
          case '-':
             int sub = a-b;
             System.out.println("The Subtraction of "+a+" and "+b+" is "+ sub);
             break;
          case '*':
            int mul = a*b;
            System.out.println("The Multiplication of "+a+" and "+b+" is "+ mul);
            break;
          case '/':
            int div = a/b;
            System.out.println("The Division of "+a+" and "+b+" is "+ div);
            break;
        }
      sc.close();
    }

  }

            
                
