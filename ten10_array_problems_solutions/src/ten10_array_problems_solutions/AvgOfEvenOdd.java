package ten10_array_problems_solutions;

public class AvgOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 23, 45, 64, 44, 98, 100 };
		int countforeven = 0, countforodd = 0, sumforeven = 0, sumforodd = 0;
		double avg1, avg2;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sumforeven += arr[i];
				countforeven += 1;
			} else {
				sumforodd += arr[i];
				countforodd += 1;
			}
		}
		System.out.println(sumforeven);
		System.out.println(countforeven);
		avg1 = sumforeven / countforeven;
		avg2 = sumforodd / countforodd;
		System.out.println("Average for all Even Numbers: " + avg1);
		System.out.println("Average for all Odd Numbers: " + avg2);
	}

}
