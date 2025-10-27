package orderEntryPhase1;

import java.util.Scanner;

public class OrderEntryPhase1 {
	// Instance Variables//
	private String itemNumber;
	private String itemDescription;
	private double itemPrice;
	private int itemQuantity;
	private double itemTax;
	private double totalDiscount;
	private double netAmount;
		
	private void getData()
	{
		//Declare Scanner Object to get data//
		Scanner input = new Scanner(System.in);
		
		//Get item for orderline//
		
		System.out.println("Enter Itenm Number");
		itemNumber = input.nextLine();
		
		System.out.println("Enter Item Description: ");
		itemDescription = input.nextLine();
		
		System.out.println("Enter Item Price:$  ");
		itemPrice = input.nextDouble();
		
		System.out.println("Enter Quantity Ordered: ");
		itemQuantity = input.nextInt();
		
		System.out.println("Enter The Total Tax for the item (decimal): ");
		itemTax = input.nextDouble();
		
		System.out.println("Enter the Total Discount for the item (decimal):$ ");
		totalDiscount = input.nextDouble();
		
		System.out.println("Enter the Net Amount for the item (decimal): ");
		netAmount = input.nextDouble();
						
	}
	
	public String toString(){
		return ("\nOrder Details:\n" + 
				"\nItem Number:" + itemNumber +
				"\nItem Description:" + itemDescription +
				"\nItem Price:" + itemPrice +
				"\nItem Quantity:" + itemQuantity + 
				"\nItme Tax:" + itemTax +
				"\nTotal Discount:" + totalDiscount +
				"\nNet Amount:" + netAmount);
	}
	
	
	public static void main(String[] args) {
		// create new order//
		
		OrderEntryPhase1 myOrder = new OrderEntryPhase1();
		
		// get the data for order//
		myOrder.getData();
		
		//Display order//
		myOrder.toString();
		

	}

}
