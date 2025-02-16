

public class Overlodingforaverage {
	static int average(int a,int b)
	{
		
		return (a+b)/2;
	}
	static int average(int a,int b,int c)
	{
		return (a+b+c)/3;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Average for 2 Subject: "+average(50,60));
		System.out.println("Average for 3 Subject: "+average(50,60,40));
	}

	
}
