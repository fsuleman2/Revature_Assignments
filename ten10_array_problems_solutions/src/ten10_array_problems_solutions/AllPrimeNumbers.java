package ten10_array_problems_solutions;
//2. Find all Prime numbers in an array
public class AllPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 22, 55, 33, 21, 56, 78, 97, 99, 100 };
		for (int i = 0; i < arr.length; i++) {
			isPrime(arr[i]);
		}
	}

	public static int isPrime(int arr) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int n = arr;
		int m = n / 2;
		for (int j = 2; j <= m; j++) {
			if (n % j == 0) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println(arr + " : Prime");
		} else {
			System.out.println(arr + " : Not Prime");
		}
		return 0;
	}

}
