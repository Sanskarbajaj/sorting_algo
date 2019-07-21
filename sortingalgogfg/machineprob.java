package sortingalgogfg;

public class machineprob {

	public static void main(String[] args) {
		//we are given machines m1 m2 and m3 having numbers in sorted form
		//output must be a full merged sorted array;
		//BEST APPROACH IS MERGESORT O(nlogn) complexity
		int [] m1= {5,6,90};
		int [] m2= {1,2,3,4,5};
		int [] m3= {4,6};
	int[] ans1=mergesortedarrays(m1,m2);
int [] ans2=mergesortedarrays(ans1,m3);
int[] finalres=mergesort(ans2,0,ans2.length-1);
for(int s:finalres)
{
	System.out.print(s+" ");
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
