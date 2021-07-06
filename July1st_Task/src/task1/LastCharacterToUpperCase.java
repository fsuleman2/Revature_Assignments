package task1;

public class LastCharacterToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello hi good evening everyone hope you are enjoying progamming with java";
		StringBuilder sb=new StringBuilder();
		String arr[] = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			int j = arr[i].length()-1;
			//System.out.println(j);
			sb.append(arr[i].substring(0,arr[i].length()-1)).append(Character.toUpperCase(arr[i].charAt(j))).append(" ");
		}
		System.out.println(sb.toString().trim());
	}

}
//2) If the string is of length even then convert first char to uppercase if it is odd then convert middle char to uppercase
