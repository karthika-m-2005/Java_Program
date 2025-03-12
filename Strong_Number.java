import java.util.Scanner;

public class Strong_Number {
	
	public static int fact(int n)
	{
		if(n==0 || n==1)
		   return 1;
		return n*fact(n-1);
		
	}
	
	
	public static boolean strongnumber(int n)
	{
		int sum = 0;
		int temp = n;
		while(n>0)
		{
			
		    int digit=n%10;
		    sum = sum+fact(digit);
		    n = n/10;
			
		}
		
		return (sum == temp)?true:false;
		
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		
		System.out.println(n+ " is a Strong Number(true/false): "+ strongnumber(n));
		sc.close();
		

	}

}
