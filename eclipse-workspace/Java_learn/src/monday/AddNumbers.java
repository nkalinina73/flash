package monday;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		Scanner inside = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		int num1 = inside.nextInt();
		
		System.out.print("Input second number: ");
		int num2 = inside.nextInt();
		
		System.out.println(num1+" x "+num2+" = "+num1 * num2);
		
	

	}

}
