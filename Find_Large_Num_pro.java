import java.util.Scanner;
class Find_Large_Num_pro
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Value: ");
      int a = sc.nextInt();
      System.out.println("Enter b Value: ");
      int b = sc.nextInt();
      System.out.println("Enter c Value: ");
      int c = sc.nextInt();

    if(a>b && a>c)
    {
      System.out.println(a+" is a greatest Number");
    }
      else if(b>a && b>c)
      {
        System.out.println(b+" is a greatest Number");
      }
      else
      {
        System.out.println(c+" is a agreatest Number");
      }
      sc.close();
    }
  }
