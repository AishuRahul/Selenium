package week5.string;

import java.util.ArrayList;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] arr={1,3,7,8,8,9,3,9};
		int count=0;
		System.out.println("Duplicate elements are:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
					
					//count++;
					System.out.println(" "+arr[i]);
				}
			}
			
			
		}
		//System.out.println("Count of repeats "+count);
		
		
		   /* void printRepeating(int arr[], int size)  
		    { 
		        int count[] = new int[size]; 
		        int i; 
		  
		        System.out.println("Repeated elements are : "); 
		        for (i = 0; i < size; i++)  
		        { 
		        	//System.out.println(count[arr[i]]);
		            if (count[arr[i]] == 1) 
		            	
		                System.out.print(arr[i] + " "); 
		            else
		                count[arr[i]]++; 
		        } 
		    } 
		  
		    public static void main(String[] args) 
		    { 
		         DuplicateElements dp =new DuplicateElements();
		        int arr[] = {1,3,3,7,8,8,9};
		        int arr_size = arr.length; 
		       dp.printRepeating(arr, arr_size); 
		    } */
		
	}

}
