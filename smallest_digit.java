

import java.util.Scanner;

public class smalldigit {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  System.out.println("enter the number : ");
		  int n = sc.nextInt();
		  
		  int digit = 0;
		  int sm = 9;
		  
		  while(n>0)
		  {
			  digit = n%10;
			  if(digit<sm)
				  sm = digit;
			  n = n/10;
			  
		  }
		  
		  System.out.println(sm);
		  sc.close();

	}

}
