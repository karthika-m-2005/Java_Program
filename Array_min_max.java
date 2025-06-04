public class Array_min_max {

	public static void main(String[] args) {
		int arr[] = {2,3,4,5,9,70};
		int big = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]>big)
			{
				big = arr[i];
			}
		}
		System.out.println("Maximum Number in Array: "+big);
		
		
		int sm = big;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]<sm)
			{
				sm = arr[i];
			}
		}
		System.out.println("Minimum Number in Array: "+sm);
		}
}
