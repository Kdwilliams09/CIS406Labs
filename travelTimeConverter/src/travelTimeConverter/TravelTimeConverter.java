//Kayla Williams CIS 406 Travel Time Converter//

package travelTimeConverter;

import java.util.Scanner;

public class TravelTimeConverter {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Travel Time Calculator");
		
		//create scanner class object for reading consul input//
		Scanner input = new Scanner(System.in);
		
		//get miles  //
		System.out.print("\nEnter Miles: ");
		double miles= input.nextDouble();
		
		//get miles per hours //
		System.out.print("Enter Miles Per Hour: ");
		double mph= input.nextDouble();
		
		//calculate trave time hrs and min output//
		double hours = miles / mph;
		System.out.println("\nEstimated Travel Time");
		System.out.println("---------------------");
		System.out.println("Hours: " + (int) hours);
		
		double minutes = ((hours - (int)hours) * 60);
		System.out.println("Minutes: " + (int) minutes);
		
		
		//exit and close Scanner//
		System.out.println("\nBye!!");
		input.close();
				

	}

}
