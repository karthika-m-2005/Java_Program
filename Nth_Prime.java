import java.util.Scanner;
class Nth_Prime
  {
public static int nthprime(int input1)
    {
    int count = 0;
        int num = 1;
        while (count < input1) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        return num;
    
    }
    private static boolean isPrime(int input)
     {
        if (input < 2) 
        {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(input); i++)
         {
            if (input % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      System.out.println(nthprime(n));
    }
}
