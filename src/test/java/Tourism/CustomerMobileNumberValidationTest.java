package Tourism;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerMobileNumberValidationTest {
/**
 * Storing Customer Name With Some Validation
 */
	@Test
	public void test() {
		CustomerInformation Check = new CustomerInformation();
		Check.customerMobileNumber = 8234567890L;
		boolean valid=CustomerMobileNumberValidation.addValidCustomerMobileNumber(Check);
		assertTrue(valid);
	}
	@Test
	public void test2() {
		CustomerInformation Check1 = new CustomerInformation();
		Check1.customerMobileNumber = 5976543210L;
		boolean valid=CustomerMobileNumberValidation.addValidCustomerMobileNumber(Check1);
		assertTrue(valid);
	}
	@Test
	public void test3()
	{
		boolean valid = CustomerMobileNumberValidation.searchMobileNumber(8234567890L);
		assertTrue(valid);
	

}
	/**
	 * Checking Number ALready Exit or not
	 */
	@Test
	public void test4()
	{
		boolean valid = CustomerMobileNumberValidation.searchMobileNumber(1234567890L);
		assertFalse(valid);
	

}
}