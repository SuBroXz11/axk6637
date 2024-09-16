// *******************************************************************
//   MilesToKm.java
//
//   Read mile value from the user and print the kilometer equivalence
// *******************************************************************

package homework;
import java.util.Scanner;

public class MilesToKm {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Float km= 1.60935f;
		
		// USER INPUT
		System.out.print("Enter miles: ");
		Float miles = scanner.nextFloat();
		
		// CONVERSION FROM MILES TO KILOMETERS
		System.out.println(miles +" miles to kilometers is "+ (miles * km) + " kilometers.");
		 
		scanner.close();

	}

}
