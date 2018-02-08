package monday;

import java.util.Scanner;

public class CilinderAndCone {

	public static void main(String[] args) {
	Cone();	
		

	}
	@SuppressWarnings("resource")
	public static void Cone() {
		double r,h,v;
		Scanner cone=new Scanner(System.in);
		System.out.println("what is the radios - ");
		r=cone.nextDouble();
		System.out.println("what is the hight - ");
		h=cone.nextDouble();
		v=Math.PI*r*r*(h/3);
		System.out.println("The Cone valume is " + v);
		
	}

}
