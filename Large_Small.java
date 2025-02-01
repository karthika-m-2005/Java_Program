import java.util.Scanner;
class Large_Small
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter A Value:");
      int a = sc.nextInt();
      System.out.print("Enter B Value:");
      int b = sc.nextInt();
      if(a<b)
      {
        System.out.println(a + "  is the Smallest Number");
      }
      else
      {
        System.out.println(b +"  is the Largest Number");
      }
      sc.close();
    }
  }

      
    
