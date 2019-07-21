package sortingalgogfg;

public class sortingofstrings {

	public static void main(String[] args) {
		// sorting by bubblesort by O(n^2)
		String[] arr = { "GeeksforGeeks", "Quiz","Practice", "Gblogs", "Coding" }; 	
		 int n = arr.length; 
		sortstrings(arr, n);
		for (int i = 0; i < n; i++) 
            System.out.println("String " + (i + 1) + " is " + arr[i]); 
    } 
	public static void sortstrings(String [] arr,int n)
	{
		for(int j=0;j<n-1;j++)
		{
			for(int i=j+1;i<n;i++)
			{
				if(arr[j].compareTo(arr[i])>0)
				{
					String temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
	}

}
