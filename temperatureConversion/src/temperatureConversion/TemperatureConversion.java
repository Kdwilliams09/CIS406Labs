package temperatureConversion;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Coverter");
		
		//create scanner class object for reading consul input//
		Scanner input = new Scanner(System.in);
		
		//get temp in Fahrenheit //
		System.out.print("\nEnter Degrees in Fahrenheit: ");
		double degreesF = input.nextDouble();
		
		//covert fahrenheit to celsius //
		double degreesC = (degreesF -32) * 5.0/9;
		System.out.println("Degrees in Celsius: " + (int) degreesC);
		
		//get temp in Celsius //
		System.out.print("\nEnter Degrees in Celsius: ");
		degreesC = input.nextDouble();
				
		//covert fahrenheit to celsius //
		degreesF = (degreesC * 9.0/5) + 32;
		System.out.println("Degrees in Fahrenheit: " + (int) degreesF);
		
		
		
		
		
		//exit and close Scanner//
		System.out.println("\n\nBye!!");
		input.close();
		

	}

}
