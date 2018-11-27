package week5.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MaximumAndMinimum {

	
	
	public static void main(String[] args) {
		
		Integer[] arr={11,13,3,7,18,8,9};
		//List<int[]> list=new ArrayList<>();
		//list=Arrays.asList(arr);
		// using Collections.min() to find minimum element 
        // using only 1 line. 
        int min = Collections.min(Arrays.asList(arr)); 
  
        // using Collections.max() to find maximum element 
        // using only 1 line. 
        int max = Collections.max(Arrays.asList(arr)); 
  
        // printing minimum and maximum numbers 
        System.out.println("Minimum number of array is : " + min); 
        System.out.println("Maximum number of array is : " + max); 
		
		
	}
}
