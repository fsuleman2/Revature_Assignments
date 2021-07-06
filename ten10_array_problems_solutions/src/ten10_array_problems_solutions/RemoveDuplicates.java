package ten10_array_problems_solutions;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 11, 22, 44, 22, 33, 22, 10, 44, 66 };
		Arrays.sort(arr);
		System.out.println("Before Removing duplicates");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		int n = arr.length;
		int j = 0;
		// new array to store distinct elements
		int temp[] = new int[n];
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[arr.length - 1];
		System.out.println("After Removing duplicates");
		for (int i = 0; i <j; i++) {
			System.out.print(temp[i] + " ");
		}
	}

}
