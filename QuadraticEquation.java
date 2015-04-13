package sixmars;
import java.util.Scanner;

public class QuadraticEquation {
	private int a;
	private int b;
	private int c;

	// Default constructor
	QuadraticEquation() {
		a = 0;
		b = 0;
		c = 0;
	}

	// user specifies coefficients
	QuadraticEquation(int newA, int newB, int newC) {
		a = newA;
		b = newB;
		c = newC;
	}

	// Get methods for coefficients
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	// Return discriminant (b^2-4ac)
	public double getDiscriminant() {
		return (Math.pow(b, 2) - 4 * a * c);
	}

	// Return the roots
	public double getRoot1() {
		return (((-b) + (Math.sqrt(getDiscriminant())))/ (2 * a));
	}

	public double getRoot2() {
		return (((-b) - (Math.sqrt(getDiscriminant()))) / (2 * a));
	}

}

public class TestQuadraticEquation {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter coefficients a, b, and c in order: ");

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		QuadraticEquation qe = new QuadraticEquation(a, b, c);
		if (qe.getDiscriminant() > 0) {
			System.out.println("The roots of the equation are " + qe.getRoot1()
					+ " and " + qe.getRoot2());
		} else {
			System.out.println("The equation has no roots.");
		}
	}
}
