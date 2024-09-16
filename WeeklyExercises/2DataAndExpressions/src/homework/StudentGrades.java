// ****************************************************************************************************
//   StudentGrades.java
//
//   Display the table of 5 students grades earned
// ****************************************************************************************************

package homework;

public class StudentGrades {

	public static void main(String[] args) {
		// HEADER
		System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("==          Student Points          ==");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////\n");
		
		// TABLE OF STUDENT GRADES
		
		// TABLE HEADER
		System.out.println("Name \t\t Lab \t Bonus \t Total");
		System.out.println("---- \t\t --- \t ----- \t -----");
		
		// TABLE BODY
		System.out.println("Ram \t\t 98 \t 2 " + "\t " + (98 + 2));
		System.out.println("Subrat \t\t 87 \t 4 "  + "\t " + (87 + 4));
		System.out.println("Ishan \t\t 50 \t 9 "  + "\t " + (50 + 9));
		System.out.println("Alan \t\t 78 \t 10 "  + "\t " + (78 + 10));
		System.out.println("Rohan \t\t 12 \t 1"  + "\t " + (12 + 1));
		
	}
}
