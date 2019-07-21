package sortingalgogfg;

import java.util.Arrays;

public class arrsubsetofanotherarray {

	public static void main(String[] args) {
		//having complexity O(n^2);
		int arr[]= {2,3,5,7,9};
		int brr[]= {2,5,9};
		int m=arr.length;
		int n=brr.length;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<brr.length;j++)
			{
				if(arr[i]==brr[j])
				{
					count++;
					break;
				}
			}
			
		}
		if(count==brr.length)
			System.out.println("subset");
		else
		{
			System.out.println("not subset");
		}
		//better method is binary search
		boolean ans=issubset(arr, arr.length, brr.length, brr);
System.out.println(ans);
	}
	public static boolean issubset(int[] arr,int m,int n,int [] brr)
	{
		Arrays.parallelSort(arr);
		for(int i=0;i<n;i++)
		{
			if(binarysearch(arr,0,arr.length-1,brr[i])==-1)
				return false;
		}
		return true;
	}
	public static int binarysearch(int[] arr,int beg,int end,int data)
	{
		
		while(beg<=end)
		{int mid=(beg+end)/2;
		if(( mid == 0 || data > arr[mid-1]) && (arr[mid] == data)) 
		{
			return mid;
		}
		else if(arr[mid]<data)
		{
			beg=mid+1;
		}
		else
		{
			end=mid-1;
		}
		}
		return -1;
	}

}
