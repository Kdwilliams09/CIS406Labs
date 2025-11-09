//Kayla Williams CIS 406
//Order Entry Phase 2

package orderEntryPhase2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class OrderEntryPhase2 {

	public static void main(String[] args) {
		
		// Instance Variables//
		String itemNumber = "?";
		String itemDescription = "?";
		double itemPrice = 0.0;
		int itemQuantity = 0;
		double grossAmount;
		double itemTax = 0;
		double taxAmount = 0;
		double totalDiscount = 0;
		double discountAmount = 0;
		double netAmount = 0;
		
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
		grossAmount = itemPrice * itemQuantity;
		taxAmount = grossAmount * itemTax / 100;
		grossAmount += taxAmount;
		discountAmount = grossAmount * totalDiscount /100;
		netAmount = grossAmount - discountAmount;
		
		//output results //
		System.out.println("\nOrder Details:\n" + 
				"\nItem Number \tItem Description \tItem Price \tItem Quantity \tGross Amount \tItem Tax \tTax Amount \tTotal Discount \tDiscount Amount \tNet Amount\n" +
				" " + itemNumber +
				"\t\t  "+ itemDescription +
				"\t\t "+ itemPrice +
				"\t\t  "+ itemQuantity + 
				"\tt   "+ grossAmount +
				"\t\t  "+ itemTax +
				"\t\t  "+ taxAmount +
				"\t\t  "+ totalDiscount +
				"\t\t  "+ discountAmount +
				"\t\t  $"+ netAmount);
		
		
		
		
		
		
		
		//Finished//
		input.close();

	}

}
