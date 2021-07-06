package ten10_array_problems_solutions;

public class PrimeNumberIndex {

	public static void main(String[] args) {
		String s = "helllllllllo";

		char c1[] = s.toCharArray(); // converting string to characterArray
		//taking each character subscript and checking weather it is prime or not
		for (int i = 2; i < c1.length; i++) {
			boolean flag = false;
			int n = i;
			int m = n / 2;
			for (int j = 2; j <= m; j++) {
				if (n % j == 0) {
					flag = true;
					break;
				}
			}// j for loop ends
			if (flag == false) {

				System.out.println(i + ": " + Character.toUpperCase(c1[i]));
			}

		} //main for ends

	}

}
