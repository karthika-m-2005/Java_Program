import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
	
		int sum =1;
		for(int i =1;i<=n;i++)
		{
		    sum *= i;
		   
		}
		System.out.println(sum);
		
		sc.close();

	}

}
