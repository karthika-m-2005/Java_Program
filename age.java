import java.util.Scanner;
class Age
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Age:");
      int Age = sc.nextInt();
      if(Age>=0 && Age <=12)
      {
        System.out.println("Child");
      }
      else if(Age>=13 && Age<=19)
      {
        System.out.println("Teenager");
      }
      else if(Age>=20 && Age<=64)
      {
        Sysyem.out.println("Adult");
      }
      else if(Age>=65)
      {
        System.out.println("Senior");
      }
    }
  }

      
