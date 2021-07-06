package ten10_array_problems_solutions;

import java.util.Arrays;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabaacdeddsdsdfsgvsgnjfjffhfggsdz";
		//converting string to char
		char c1[] = s.toCharArray();
		//sorting the character array
		Arrays.sort(c1);
		System.out.println("Elements Before Removing duplicates");
		for (char i : c1) {
			System.out.print(i + " ");
		}
		System.out.println();
		//size of the character array
		int n = c1.length;
		//creating the temp array to store to distinct characters
		char c[] = new char[s.length()];
		//main logic
		int j=0;
		for (int i = 0; i <n-1; i++) {
			if(c1[i]!=c1[i+1]){
				c[j++] = c1[i];
			}	
		}
		c[j++] = c1[c1.length-1];
		System.out.println("After Removing duplicates");
		for (int i = 0; i < j; i++) {
			System.out.print(c[i]+" ");
		}

	}

}
