// Author: Diyang Qiu
// Date: June 1st
// Purpose: classes funtions
// Page:3 LineItemApp class

import java.util.Scanner;


public class LineItemApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Welcome to the Line Item Calculator");
	System.out.println();
	
	Scanner sc = new Scanner(System.in);
	String choice = "y";
	
	while (choice.equalsIgnoreCase("y"))
	{		
		String productCode = sc.next();
		ProductDB db = new ProductDB();
		Product product = db.getProduct(productCode);
		System.out.println("Description: "+ product.getDescription());
		System.out.println("Price: "+product.getPrice());
	}
	}

}
