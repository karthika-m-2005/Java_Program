import java.util.Scanner;

public class magicnumber {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();
		int sum = 0;
		int digit = 0;
		
		while(n>0)
		{
			digit = n%10;
			sum = sum+digit;
			n = n/10;
			
		}
		
			sum = sum/10;
			
			if(sum==1)
			{
				System.out.println(sum);
			}
		
		sc.close();
	}

}
