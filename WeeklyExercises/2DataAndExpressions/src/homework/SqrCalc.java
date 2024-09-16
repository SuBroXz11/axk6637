// *****************************************************************************************
//   SqrCalc.java
//
//   Read length value of one side of square from the user and print it's perimeter and area
// ******************************************************************************************

package homework;
import java.util.Scanner;

public class SqrCalc {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		// PROMPT USER FOR SQUARES SIDELENGTH
		System.out.print("Enter square's side length: ");
		int sideLength=scanner.nextInt();
		
		// VARIABLE DECLARATION
		int perimeter, area;
		
		// PERIMETER = 4S {S= LENGTH OF ONE SIDE OF SQUARE}
		perimeter= 4 * sideLength;
		
		// AREA = LENGTH OF ONE SIDE OF SQUARE ^ 2
		area= sideLength * sideLength;
		System.out.println("The perimeter of the square is "+ perimeter +"\nand \nThe area of the square is " + area);
		
		scanner.close();
		
	}

}
