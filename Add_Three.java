import java.util.Scanner;
class Add_Three
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the a value:");
      int a = sc.nextInt();
      System.out.println("Enter the b value:");
      int b = sc.nextInt();
      System.out.println("Enter the c value:");
      int c = sc.nextInt();
      int d = a+b+c;
      System.out.println("Sum of Three Number:"+d);
      sc.close();
    }
  }
