package ten10_array_problems_solutions;

import java.util.Arrays;

public class PrintNumberFreq {

	public static void main(String[] args) {
		int arr[] = { 11, 22, 22, 44, 100, 22, 33, 22, 10, 44, 66, 22, 1, 1, 1, 1, 1, 100, 100, 100, 100, 100, 1001,
				100 };
		System.out.println("Before Printing");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		int freq = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[i] == arr[i + 1]) {
					freq = arr[i];
				}
			}
		}
		System.out.println(freq);

	}

}
