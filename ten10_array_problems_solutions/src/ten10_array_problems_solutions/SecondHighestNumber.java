package ten10_array_problems_solutions;

import java.util.Arrays;

public class SecondHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = { 11, 22, 44, 22, 33, 22, 10, 44, 66};
		int arr[] = { 11, 22, 22, 44, 100, 22, 33, 22, 10, 44, 66, 22,  1, 1, 200, 100, 100, 1001,
				100 };
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		int n = arr.length;
		int j = 0;
		// new array to store distinct elements
		int temp[] = new int[n];
		//removing duplicates logic
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[arr.length - 1];
		System.out.println("Second Highest Among All: "+temp[j-2]);
	}

}
