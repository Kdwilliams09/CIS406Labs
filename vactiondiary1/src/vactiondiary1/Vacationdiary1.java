//Kayla Williams CIS406 VacationDiary1
package vactiondiary1;

import java.util.Scanner;

public class Vacationdiary1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vaction Diary");
		System.out.println();
		
		// user input prompt//
		System.out.print("Enter the Data Vaction started (mm/dd/yyyy): ");
		Scanner input = new Scanner(System.in);
		String startDate = input.next();
		
		System.out.print("Enter City Visted: ");
		String placeCity = input.next();
		System.out.print("Enter Country Visted: ");
		String placeCountry = input.next();
		System.out.print("Enter Number of days: ");
		String numDays = input.next();
		System.out.print("Enter Mode of Travel (car, airplane, ship, train, bus): ");
		String travelMode = input.next();
		
		//Display the output//
		System.out.println();
		System.out.println("Details of your trip: ");
		System.out.println("Date: " + startDate);
		System.out.println("City: " + placeCity);
		System.out.println("Country: " + placeCountry);
		System.out.println("Number of Days: " + numDays);
		System.out.println("Traveled By: " + travelMode);
		
		//close scanner object//
		input.close();
			
	}

}
