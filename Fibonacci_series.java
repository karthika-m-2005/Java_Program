import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(num1+" ");
		for(int i = 0; i<=n;i++)
		{
			System.out.print(num2+" ");
			int num3 = num1+num2;
			num1 = num2;
			num2 = num3;
			
		}
		
		
		
		
	}

}
