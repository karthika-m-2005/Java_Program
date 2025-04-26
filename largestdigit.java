

import java.util.Scanner;

public class largestdigit {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter the number : ");
	  int n = sc.nextInt();
	  
	  int digit = 0;
	  int big = 0;
	  
	  while(n>0)
	  {
		  digit = n%10;
		  if(big<digit)
			  big = digit;
		  n = n/10;
		  
	  }
	  
	  System.out.println(big);
	  sc.close();

	}

}
