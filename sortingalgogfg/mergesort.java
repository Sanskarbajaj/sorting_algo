package sortingalgogfg;

public class mergesort {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,1,19,2,34};
	//	int[] arrr=mergesortedarrays(arr, brr);
		
		int[] ans=mergesort(arr,0,arr.length-1);
		
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
	public static int[] mergesortedarrays(int[] arr,int [] brr)
	{
		int i=0,j=0,k=0;
		int [] a=new int[arr.length+brr.length];
		while(i<arr.length&&j<brr.length)
		{
			if(arr[i]<brr[j])
			{
				a[k]=arr[i];
				i++;
				k++;
			}
			else 
			{
				a[k]=brr[j];
				j++;
				k++;
			}
		}
		while(j<brr.length)
		{
			a[k]=brr[j];
			j++;
			k++;
		}
		while(i<arr.length)
		{
			a[k]=arr[i];
			i++;
			k++;
		}
		return a;
	}
	public static int[] mergesort(int[] arr,int start,int end)
	{
		if(start==end)
		{
			int [] br=new int[1];
			br[0]=arr[start];
			return br;
		}
		int mid=(start+end)/2;
		int[] fh=mergesort(arr, start,mid);
		int [] sh=mergesort(arr,mid+1, end);
		int [] merged=mergesortedarrays(fh,sh);
		return merged;
	}

}
