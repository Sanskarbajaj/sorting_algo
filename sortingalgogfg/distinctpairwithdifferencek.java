package sortingalgogfg;

import java.util.Arrays;

public class distinctpairwithdifferencek {

	public static void main(String[] args) {
		// ist method is by using 2 loops having complexity O(n^2)
		//2nd using binary search best approach O(nlogn)
		int arr[]= {1,2,3,4,5,6,7};
		int k=3;
		System.out.println(countPairsWithDiffK(arr,arr.length, k));
		
		

	}
	 public static int countPairsWithDiffK(int arr[], int n, int k) 
	{ 
	    int count = 0, i; 
	   Arrays.parallelSort(arr);  // Sort array elements 
	  
	    /* code to remove duplicates from arr[] */
	    
	    // Pick a first element point 
	    for (i = 0; i < n-1; i++) 
	        if (binarySearch(arr, i+1, n-1, arr[i] + k) != -1) 
	            count++; 
	  
	    return count; 
	} 
	 
	public static int binarySearch(int arr[], int low, int high, int x) 
	{ 
	    if (high >= low) 
	    { 
	        int mid = low + (high - low)/2; 
	        if (x == arr[mid]) 
	            return mid; 
	        if (x > arr[mid]) 
	            return binarySearch(arr, (mid + 1), high, x); 
	        else
	            return binarySearch(arr, low, (mid -1), x); 
	    } 
	    return -1; 
	} 

}
