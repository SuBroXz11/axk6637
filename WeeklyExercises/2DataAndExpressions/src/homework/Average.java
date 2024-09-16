// *******************************************************************
//   Average.java
//
//   Read three integers from the user and print their average
// *******************************************************************
package homework;

import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		int val1, val2, val3;
	       double average;
	       Scanner scan = new Scanner(System.in) ;

	       // get three values from user
	       System.out.println("Please enter three integers and " +
	                       "I will compute their average");
	       
	       // first value
	       System.out.print("Enter the first value: ");
	       val1=scan.nextInt();
	       
	       // second value
	       System.out.print("Enter the second value: ");
	       val2=scan.nextInt();
	       
	       // third value
	       System.out.print("Enter the third value: ");
	       val3=scan.nextInt();


	       //compute the average
	       average=(double)(val1 + val2 + val3) / 3;
	       
	       //print the average
	       System.out.print("The average is " + average);
	       
	       scan.close();
	       
	}
}
