import java.util.Scanner;
class Sum_Even
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter 1st which Number will Add:");
      int a = sc.nextInt();
      System.out.print("Enter 2nd  which Number will Add:");
      int b = sc.nextInt();
      int sum = a+b;
      if(sum%2 == 0)
      {
        System.out.println("The Sum of "+a+" and "+b+" is Even Number");
      }
      else
      {
        System.out.println("The Sum of "+a+" and "+b+" is Odd Number");
      }
    }
  }
