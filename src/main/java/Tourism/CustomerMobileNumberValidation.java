package Tourism;

import java.util.ArrayList;

public class CustomerMobileNumberValidation {
	static ArrayList<CustomerInformation> CustomerList = new ArrayList<CustomerInformation>();
/**
 * Validate Customer Number
 * @param customerNumber
 * @return
 */
	public static boolean addValidCustomerMobileNumber (CustomerInformation customerNumber) {
		boolean validation = false;
		 {
			 ///changing number long to string to check length
			 String change=String.valueOf(customerNumber.customerMobileNumber);
			if(change.length()==10 && (change.startsWith("8")||change.startsWith("9")
					||change.startsWith("5")))
			{
			validation = true;
			CustomerList.add(customerNumber);
			System.out.println(customerNumber);
		}
		return validation;

	}}
	/**
	 * number is already exit or not
	 */
	
	public static boolean searchMobileNumber(long number) {
		boolean exits = false;
		for (CustomerInformation Details : CustomerList) {

			if (Details.customerMobileNumber==number) {
				exits = true;
				break;
			}
		}
		if (exits) {
			System.out.println("Valid Customer");
		} else {
			System.out.println("Invalid Customer");
		}

		return exits;
	}

public static void displayNumer()
{
	System.out.println(CustomerList);
}
}