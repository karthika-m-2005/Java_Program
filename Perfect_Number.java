import java.util.Scanner;

public class Perfect_Number {
	
	public static boolean perfectnumber(int n)
	{
		int sum = 0;
		int temp = n;
		for(int i = 1;i<n;i++)
		{
			if(n%i==0)
			{
				sum = sum+i;
			}
		}
		return sum==temp;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		System.out.println(number+ " is a Perfect Number: "+perfectnumber(number));
		sc.close();
		

	}

}
