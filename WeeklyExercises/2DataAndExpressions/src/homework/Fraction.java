// ****************************************************************************************************
//   Fraction.java
//
//   Read numerator and denominator value of fraction from the user and print their decimal equivalence
// ****************************************************************************************************

package homework;
import java.util.Scanner;

public class Fraction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// USER INPUT FOR NUMERATOR
		System.out.print("Enter numerator: ");
		int numerator=scanner.nextInt();
		
		// USER INPUT FOR DENOMINATOR
		System.out.print("Enter denominator: ");
		int denominator=scanner.nextInt();
		
		// CALCULATION OF DECIMAL EQUIVALENT OF THE FRACTION
		float decimalEquivalent;
		decimalEquivalent= (float) numerator / denominator;
		
		System.out.print("The decimal equivalent is " + decimalEquivalent);
		
		scanner.close();
		

	}

}
