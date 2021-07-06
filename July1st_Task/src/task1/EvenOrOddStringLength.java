package task1;

public class EvenOrOddStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello hi good evening everyone hope you are enjoying progamming with java";
		// storing string into array
		String arr[] = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() % 2 == 0) {
				sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
			}
			else {
				int mid = arr[i].length()/2;
				sb.append(arr[i].substring(0,mid)).append(Character.toUpperCase(arr[i].charAt(mid))).append(arr[i].substring(mid+1)).append(" ");
			}
		}
		System.out.println(sb.toString().trim());
	}

}
