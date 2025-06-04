package Array_Basics;

import java.util.Arrays;

public class Array_P1 {

	public static void main(String[] args) {
		
		//using for loop
		int a[] = {1,2,3,4,5,6};
        for(int i = 0;i<a.length;i++)
        {
        	System.out.println(a[i]);
        }
        //using for each loop
        int b[] = {10,11,12,13,14,15};
        for(int x :b)
        {
        	System.out.println(x);
        }
        
        int c[] = {1,2,3};
        System.out.println(Arrays.toString(c));
        
     
	}

}
