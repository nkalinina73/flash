package monday;

import java.util.Scanner;

public class calulator {
	

	   public static void main(String[] args) {

	       Scanner reader = new Scanner(System.in);
	       System.out.print("Enter first number: ");

	       // nextDouble() reads the next double from the keyboard
	       double first = reader.nextDouble();
	       System.out.print("Enter second number: ");

	       double second = reader.nextDouble();

	       System.out.print("Enter an operator (+, -, *, /): ");
	       char operator = reader.next().charAt(0);

	       double result;

	       switch(operator)
	       {
	           case '+':
	               result = first + second;
	               break;

	           case '-':
	               result = first - second;
	               break;

	           case '*':
	               result = first * second;
	               break;

	           case '/':
	               result = first / second;
	               break;

	           // operator doesn't match any case constant (+, -, *, /)
	           default:
	               System.out.printf("Error! operator is not correct");
	               return;
	       }

	       System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
	   }
	

	/*public static void main(String[] args) {
		double n1=9;
		double n2=36;
		
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);

		// TODO Auto-generated method stub

	}*/

}
