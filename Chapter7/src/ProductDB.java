// Author: Diyang Qiu
// Date: June 1st
// Purpose: classes funtions
// Page:2 ProductDB class

public class ProductDB {
	
	public static Product getProduct(String productCode)
	{
	       Product product = new Product();
	       product.setCode(productCode);
	       
	       if (productCode.equalsIgnoreCase("java"))
	       {
	    	   product.setDescription("Murach's Begining Java");
	    	   product.setPrice(49.5);
	       }
	       else if (productCode.equalsIgnoreCase("jsps"))
	       {
	    	   product.setDescription("Murach's Java Servlets and JSP");
	    	   product.setPrice(49.5);	    	   
	       }
	       else if (productCode.equalsIgnoreCase("mcb2"))
	       {
	    	   product.setDescription("Murach's Mainfram COBOL");
	    	   product.setPrice(59.5);
	       }
	       else if (productCode.equalsIgnoreCase("txtp"))
	       {
	    	   product.setDescription("TaxtPad");
	    	   product.setPrice(20);
	       }
	       else
	       {
	    	   product.setDescription("Unknown");
	       }
	       return product;
	}

}
