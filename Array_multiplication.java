package Array_Basics;

import java.util.Arrays;

public class Array_multiplication {

	public static void main(String[] args) {
            
		int arr1[] = {1,2,3,4,5,6,7,8,9,10};
		int[] mul = new int[arr1.length];
		for(int i =0;i<arr1.length;i++)
		{
			mul[i]=arr1[i]*5;
			
			
		}
		System.out.println(Arrays.toString(mul));
		
	}

}
