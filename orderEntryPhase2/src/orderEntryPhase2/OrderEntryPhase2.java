//Kayla Williams CIS 406
//Order Entry Phase 2

package orderEntryPhase2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class OrderEntryPhase2 {

	public static void main(String[] args) {
		
		// Instance Variables//
		String itemNumber;
		String itemDescription;
		double itemPrice;
		int itemQuantity;
		double grossAmount;
		double itemTax;
		double taxAmount;
		double totalDiscount;
		double discountamount;
		double netAmount;
		
		//Input Data//
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Enter Item Number: ");
			itemNumber = input.nextLine();
			
			System.out.print("Enter Item Description: ");
			itemDescription = input.nextLine();
					
			System.out.print("Enter Item Price: $");
			itemPrice = input.nextDouble();
					
			System.out.print("Enter Quantity Ordered: ");
			itemQuantity = input.nextInt();
			
			System.out.print("Enter The Total Tax for the item (decimal): ");
			itemTax = input.nextDouble();
					
			System.out.print("Enter the Total Discount for the item (decimal): $");
			totalDiscount = input.nextDouble();
					
			System.out.print("Enter the Net Amount for the item (decimal): $");
			netAmount = input.nextDouble();
		}
		catch(InputMismatchException e){
			System.out.println("Input Format Error!");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Another Input Errorr!");
		}
		
		// Calculations //
		
		
		
		
		
		
		
		
		//Finished//
		input.close();

	}

}
