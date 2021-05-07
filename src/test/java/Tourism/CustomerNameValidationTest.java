package Tourism;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CustomerNameValidationTest {
	
	/**
	 * if validation is success it will store names
	 */


	@Test

	public void test() {

		CustomerInformation Check = new CustomerInformation();
		Check.customerName ="Swetha";
		boolean valid=CustomerNameValidation.addValidCustomerName(Check);
		assertTrue(valid);													
	}

	@Test
	public void test1() {

		CustomerInformation Check = new CustomerInformation();
		Check.customerName ="Kirthika";
		boolean valid=CustomerNameValidation.addValidCustomerName(Check);
		assertTrue(valid);
	}
	@Test
	public void test2() {

		CustomerInformation Check = new CustomerInformation();
		Check.customerName ="   se";
		boolean valid=CustomerNameValidation.addValidCustomerName(Check);
		assertFalse(valid);
	}
	/**
	 * Searching Name is already exit or not
	 */
	@Test
	public void test3() {
		boolean valid = CustomerNameValidation.searchCustomerName("kirthika");
		assertTrue(valid); 
}
	@Test
	public void test4() {

		CustomerInformation Check = new CustomerInformation();
		Check.customerName ="";
		boolean valid=CustomerNameValidation.addValidCustomerName(Check);
		assertFalse(valid);
	}
	@Test
	public void test5() {

		CustomerInformation Check = new CustomerInformation();
		Check.customerName ="sentha123";
		boolean valid=CustomerNameValidation.addValidCustomerName(Check);
		assertFalse(valid);
	}
}