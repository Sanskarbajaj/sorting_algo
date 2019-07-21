package sortingalgogfg;

public class sorting0s1sadn2 {

	public static void main(String[] args) {
		// we are using Dutch National Flag Algo
		int arr[]= {1,0,2,1,0,2,2,1,0,0};
		//mid will traverse the whole array 
		int low=0,mid=0,high=arr.length-1;
		//main purpose is supposing 1 as pole and if 0 comes put it on left and if 2 comes put in right and automatically
		//we get 1 in middle;
		while(mid<high)
		{
			switch(arr[mid])
			{
			case 0:
			{
				swap(arr,low,mid);
				low++;
				mid++;
				break;
			}
			case 1:
			{
				mid++;
				break;
			}
			case 2:
			{
				swap(arr,mid,high);
				high--;
				
			}
			}
		}
		for(int s:arr)
		{
			System.out.print(s);
		}

	}
	//swapping indexes
	public static void swap(int[] arr,int x,int y)
	{
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}

}
