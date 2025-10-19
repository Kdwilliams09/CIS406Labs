//Kayla Williams CIS406 Student Registration Lab//
package studentRegistration;

import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Student Registration Form");
		System.out.println();
		
		//promt for user input//
		System.out.print("Enter First Name: ");
		Scanner input = new Scanner(System.in);
		String firstName = input.next();
		
		System.out.print("Enter Last Name: ");
		String lastName = input.next();
		
		System.out.print("Enter Year of Birth: ");
		String birthYear = input.next();
		
		
		//create the variables//
		String fullName = firstName + " " + lastName;
		String password = firstName + "*" + birthYear;
		
		//Display output//
		System.out.println();
		System.out.println("Welecom " + fullName + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + password);
		
		
		//close scanner object//
		input.close();
		
	}
	
}