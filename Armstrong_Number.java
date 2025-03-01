import java.util.Scanner;
import java.lang.Math;

public class Armstrong_Number {
	
	static int counts(int n)
	{
      int c = 0;
		
	    while(n>0)
	    {
	    
	       n=n/10;
	       c++;
	       
	      
	    }
	    return c;
	}
	
	static boolean armStrong(int n)
	{
		int sum = 0;
		int temp = n;
		int count = counts(n);
		while(n>0)
		{
			int digit = n%10;
			sum = sum + (int)Math.pow(digit,count);
			n = n/10;
		}
		
		return (sum==temp)?true:false;
	}

	public static void main(String[] args) {
		System.out.print("Enter the Number to check given number is Armstrong or not: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		
		System.out.println(n+" is a Armstrong Number(true/false):  "+armStrong(n));
		sc.close();

	}

}
