/* Nandini Pachare Roll no 34 
SE IT B 
 * Practical 4 
 * Design a base class shape with two double type values and member functions to input the data and compute_area() for calculating area of shape. 
 * Derive two classes: triangle and rectangle. Make compute_area() as abstract function and redefine this function in the derived class to suit their requirements.
 *  Write a program that accepts dimensions of triangle/rectangle and display calculated area. 
 * Implement dynamic binding for given case study.
 */

import java.util.Scanner;

abstract class Shape {
	double dim1;
	double dim2;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first dimension ");
		dim1 = sc.nextDouble();
		System.out.print("Enter second dimension ");
		dim2 = sc.nextDouble();
	}

	abstract double compute_area(double one, double two); //abstract method
}

class Triangle extends Shape { 
	
	//implementing abstract method in child class
	double compute_area(double one, double two) {
		
		return 0.5 * one * two;
	}

}

class Rectangle extends Shape {
	
	//implementing abstract method in child class
	double compute_area(double one, double two) {
		
		return one * two;

	}
}

public abstract class Main1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.print("\n\t\tMenu\n\t1. AREA OF TRIANGLE\n\t2. AREA OF RECTANGLE\n\t3. EXIT");
			Scanner s = new Scanner(System.in);
			int ch = s.nextInt();
			switch (ch) {
			case 1:
				 /* Reference is of Shape type and object is Triangle type*/
				Shape obj1 = new Triangle(); //dynamic binding
				System.out.println("Enter dimensions of triangle ");
				obj1.input();
				System.out.print("\nThe area of triangle with given dimension is ");
				System.out.println(obj1.compute_area(obj1.dim1, obj1.dim2));
				break;
			case 2:
				 /* Reference is of Shape type and object is Rectangle type*/
				Shape obj2 = new Rectangle(); //dynamic binding
				System.out.println("\n\nEnter dimensions of rectangle ");
				obj2.input();
				System.out.print("\nThe area of rectangle with given dimension is ");
				System.out.println(obj2.compute_area(obj2.dim1, obj2.dim2));
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}

		}
	}

}