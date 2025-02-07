import java.util.Scanner;

class Invoke_methods
  {
    int l;
    int b;
    int h;
    int Volume()
    {
      return l*b*h;
    }
  }
public class Demo_methods
  {
    
    public static void main(String args[])
    {
     Invoke_methods B_Box;
  
     B_Box = new Invoke_methods();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Length for Black Box:");
     B_Box.l = sc.nextInt();
     System.out.println("Enter the Breath for Black Box:");
     B_Box.b = sc.nextInt();
     System.out.println("Enter the Height for Black Box:");
     B_Box.h = sc.nextInt();

    System.out.println("The Volume of Black Box:"+B_Box.Volume());
    sc.close();
    }
  }

  
  
  
