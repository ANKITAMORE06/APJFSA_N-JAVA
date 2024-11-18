package core_java;

public class Perimeter {


	// Method to calculate the perimeter of a square
	public double calculatePerimeter(double side) {
		return 4 * side; // Formula for perimeter of a square
	}

	// Method to calculate the perimeter of a rectangle
	public double calculatePerimeter(double length, double breadth) {
		return 2 * (length + breadth); // Formula for perimeter of a rectangle
	}

	// Method to calculate the perimeter of a circle
	public double calculatePerimeter(double radius) {
		return 2 * (50.0 / 7) * radius; // Formula for perimeter (circumference) of a circle
	}

	public static void main(String[] args) {
		// Creating an instance of Perimeter class
		Perimeter perimeterCalculator = new Perimeter();

		// Calculating and displaying the perimeter of a square
		System.out.println("Perimeter of Square: " + perimeterCalculator.calculatePerimeter(25)); // side = 25

		// Calculating and displaying the perimeter of a rectangle
		System.out.println("Perimeter of Rectangle: " + perimeterCalculator.calculatePerimeter(16, 14)); // length = 16, breadth = 14

		// Calculating and displaying the perimeter of a circle
		System.out.println("Perimeter of Circle: " + perimeterCalculator.calculatePerimeter(17)); // radius = 17
	}



}

/*OUTPUT
Perimeter of Square: 100.0
Perimeter of Rectangle: 60.0
Perimeter of Circle: 68.0 */
