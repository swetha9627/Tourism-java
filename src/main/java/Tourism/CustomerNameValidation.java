package Tourism;

import java.util.*;

public class CustomerNameValidation {
				//Store information in list
	static ArrayList<CustomerInformation> CustomerList = new ArrayList<CustomerInformation>();
/**
 * //return true or false to check valid name
 * @param customer
 * @return
 */
	public static boolean addValidCustomerName(CustomerInformation customer) {
		boolean validation = false; 
		{
			if (customer.customerName!=null&&customer.customerName.trim().length() > 2
					&&customer.customerName.trim().matches("^[a-zA-Z]*$"))//validation names
			{
				
			CustomerList.add(customer);
			System.out.println("Valid Customer");
			validation = true;
			System.out.println(customer);
			}
			else
			{
				
			System.out.println("Invalid Customer");
			}
		}
		return validation;
			
	}
	/**
	 * //iterate name to check already exit or not
	 * @param name
	 * @return
	 */
	
	  public static boolean searchCustomerName(String name) { boolean exits =
	  false; for (CustomerInformation customer : CustomerList) {
	  
	  if (customer.customerName.equalsIgnoreCase(name)) { exits = true; break; } }
	  if (exits) { System.out.println("Valid Customer"); } else {
	  System.out.println("Invalid Customer"); }
	  
	  return exits; }
	 
/**
 * //displaying names
 */
public static void displayName()
{
	System.out.println(CustomerList);
}
}
	
	