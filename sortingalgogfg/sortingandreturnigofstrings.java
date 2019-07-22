package sortingalgogfg;

import java.util.Arrays;

public class sortingandreturnigofstrings {

	public static void main(String[] args) {
		String input="sanskarbajaj";
		String ans=sortt(input);
		System.out.println(ans);

	}
	public static String sortt(String input)
	{
		char arr[]=new char[input.length()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=input.charAt(i);
		}
		Arrays.parallelSort(arr);
		StringBuilder sb=new StringBuilder(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			sb.append(arr[i]);
		}
		return sb.toString();
	}

}
