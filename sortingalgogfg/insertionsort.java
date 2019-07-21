package sortingalgogfg;

public class insertionsort {

	public static void main(String[] args) {
		 int[] arr= {9,8,7,6,54,3,2,1};
		 for(int i=1;i<arr.length;i++)
		 {
			 for(int j=i;j>0&&arr[j]<arr[j-1];j--)
			 {
				 int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
			 }
		 }
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }

	}

}
