package sortingalgogfg;

public class ifthwohalfaresorted {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,-1,7,8};
		//naive approach to sort this array megersort O(nlogn)
		//but better approach can be in O(n)
		//first make a partition
		int partition=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				partition=i;
				break;
			}
		}

		int[] ist=new int[partition];
		int[] scnd=new int[arr.length-partition];
		for(int i=0;i<=partition;i++)
		{
			ist[i]=arr[i];
		}
		for(int i=partition+1;i<arr.length-1;i++)
		{
			scnd[i]=arr[i];
		}
		int[] ans=mergesortedarrays(ist,scnd);
		for(int s:ans)
		{
			System.out.print(s);
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

}
