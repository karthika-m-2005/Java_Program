import java.util.Scanner;

public class SumofNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int product = 0;
		for(int i = 1;i<=num;i++)
		{
			product = product+i;
		}
		System.out.println("Sum of Natural Number: "+product);
		sc.close();
		

	}

}
