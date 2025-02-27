import java.util.Scanner;
public class swap
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Value: ");
    int a = sc.nextInt();
    System.out.println("Enter b Value: ");
    int b = sc.nextInt();
    int temp = a;
    a = b;
    b = temp;
    System.out.println("A Value: "+a);
    System.out.println("B Value: "+b);
    sc.close();
  }
}
