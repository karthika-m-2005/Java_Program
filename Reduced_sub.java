public class Reduced_sub {
	
	public static int reduce(int n)
	{
		int result = 0;
		String s = n+"";
		while(n>9)
		{
		
		for(int i = 0;i<s.length()-1;i++)
		{
			int d1 = s.charAt(i)+'0';
			int d2 = s.charAt(i+1)+'0';
			result = result*10+Math.abs(d1-d2);
		}
		
		n = result;
		}
		
		return n;
	}

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 or more digit Number: ");
		int n = sc.nextInt();
		
		System.out.println(reduce(n));
		sc.close();
     
	}

}
  
