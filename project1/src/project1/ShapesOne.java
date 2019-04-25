package project1;

import java.util.Scanner;

public class ShapesOne {
	public static void main(String[] args) {
		Shapes c = new Shapes();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius: ");
		float r = scan.nextFloat();
		c.circle(r);
		
		System.out.println("Enter sides: ");
		float s = scan.nextFloat();
		c.square(s);
	}
}
