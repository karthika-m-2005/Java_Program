public class VarArgument {
	
	static int MinValue(int... vals)
	{
		int min = Integer.MAX_VALUE;
		for(int k : vals)
		{
			if(k<min)
			{
				min = k;
			}
			
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		int m = MinValue(1,223,4,5,6,-1,-4);
		System.out.println("Minimum Value of the Number: "+m);
		int n = MinValue(8,9,6);
		System.out.println("Minimum Value of the Number: "+n);
		int x = MinValue();
		System.out.println(x);

	}

}
