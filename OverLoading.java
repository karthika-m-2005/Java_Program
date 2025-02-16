public class OverLoading {
	static float max(int a,int b)
	{
		return a>b?a:b;
	}
	
	static char max(char a, char b)
	{
		return a>b?a:b;
	}

	public static void main(String[] args) {
		System.out.println(max(5,6));
		

		System.out.println(max('p','c'));
		
		
		

	}

}

    
