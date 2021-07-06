package ten10_array_problems_solutions;
//1. Find all the Palindrome in an array
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Find all the palindrome in an array");
		String arr[] = { "MADAM", "MAM", "SYED", "101", "EYE", "1234" };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " " + isPalindrome(arr[i]));
		}
	}

	public static boolean isPalindrome(String s) {
		StringBuffer sb = new StringBuffer(s);
		String temp = sb.reverse().toString();
		return s.equals(temp);

	}
}
