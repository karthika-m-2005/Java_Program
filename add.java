import java.util.Scanner;
class add
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the a value:");
      int a = sc.nextInt();
      System.out.println("Enter the b value:");
      int b = sc.nextInt();
      int c = a+b;
      System.out.println("Sum of a and b:"+c);
      sc.close();
    }
  }
