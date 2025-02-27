import java.util.Scanner;
class add
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = a+b;
      System.out.println("Sum of a and b:"+c);
      sc.close();
    }
  }
