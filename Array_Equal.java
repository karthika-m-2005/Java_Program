public class Array_Equal {
	
	public static boolean checkequal(int arr1[],int arr2[] )
	{
		if(arr1.length == arr2.length)
		{
			for(int i = 0;i<arr1.length;i++)
			{
				if(arr1[i] != arr2[i])
				{
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		int arr1[] = {1,2,4,3,4,6};
		int arr2[] = {1,2,4,3,4,5};
		if(checkequal(arr1,arr2))
		{
			System.out.println("Both the array are equal");
		}
		else
		{
			System.out.println("Both the are not equal");
		}
}
