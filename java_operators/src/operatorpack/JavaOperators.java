package operatorpack;

import java.util.Scanner;

public class JavaOperators {
public static void main(String[] args) {
	System.out.println("Programmer Calulator");
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter \n 1.To perform Addition\n 2.To perform Subtraction\n 3.To perform Multiplication \n 4.To perform Division\n 5.To perform Modulus \n 6.To perform Increment \n 7.To perform Decrement\n 8.To perform Left Shift \n 9.To perform Right shift \n 10. To print * pattern");
	int input = scan.nextInt();
	System.out.println("Please Enter X and Y Values");
	int x = scan.nextInt();
	int y = scan.nextInt();
	if(input>0 && input <=10) {
		switch(input) {
		case 1 : System.out.println("Addition "+(x+y));
		break;
		case 2 : System.out.println("Subtraction"+(x-y));
		break;
		case 3 : System.out.println("Multiplication "+(x*y));
		break;
		case 4 : System.out.println("Division "+(x/y));
		break;
		case 5 : System.out.println("Modulus "+(x%y));
		break;
		case 6: System.out.println("Post Increment "+x++ +"\n"+"Pre Increment "+ ++y);
		break;
		case 7 : System.out.println("Post Decrement "+x-- +"\n"+"Pre Decrement "+ --y);
		break;
		case 8 : System.out.println("Left Shift "+ (x<<y));
		break;
		case 9 : System.out.println("Right Shift "+(x>>y));
		break;
		case 10 : for(int i=1; i<=x;i++)
				{
					for(int j=1;j<=i;j++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
		break;
		default: System.out.println("please enter valid input");
		break;
		}
	}
	else {
		System.out.println("Please Enter Number between 1 to 7");
	}
}
}
