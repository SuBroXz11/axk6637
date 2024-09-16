// ***************************************************************
//   Salary.java
//
//   Computes the amount of a raise and the new
//   salary for an employee.  The current salary
//   and a performance rating (a String: "Excellent",
//   "Good" or "Poor") are input.
// ***************************************************************

package homework2;

import java.util.Scanner;
import java.text.NumberFormat;

public class Salary {


	public static void main(String[] args) 
	{
		double currentSalary;  // employee's current  salary
	       double raise;          // amount of the raise
	       double newSalary;      // new salary for the employee
	       String rating;         // performance rating
	       
	       // ratings stored as variables
	       String excellent="Excellent";
	       String good="Good";
	       String poor="Poor";
	       double raises=0;
	       

	       Scanner scan = new Scanner(System.in);

	       System.out.print ("Enter the current salary: ");
	       currentSalary = scan.nextDouble();
	       System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
	       rating = scan.next();

	       // Compute the raise using if ...
	       if(rating.equals(excellent)) {
	    	   raises=6;
	       }
	       else if(rating.equals(good)) {
	    	   raises=4;
	       }
	       else if(rating.equals(poor)) {
	    	   raises=1.5;
	       }
	       else if(rating != excellent && rating != good && rating != poor){
	    	   System.out.println("Please enter Excellent, Good or Poor....");
	    	   System.exit(0); // to break the program if the user enter other values
	       }
	       
	       raise=currentSalary * raises / 100;
	       newSalary = currentSalary + raise;

	       // Print the results
	       NumberFormat money = NumberFormat.getCurrencyInstance();
	       System.out.println();
	       System.out.println("Current Salary:       " + money.format(currentSalary));
	       System.out.println("Amount of your raise: " + money.format(raise));
	       System.out.println("Your new salary:      " + money.format(newSalary));
	       System.out.println();
	       
	       scan.close();

	}

}
