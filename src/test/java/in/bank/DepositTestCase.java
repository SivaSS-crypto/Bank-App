package in.bank;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DepositTestCase {
//	User user1 = null;
//
//	@Before
//
//	public void setup() {
//		user1 = new User();
//		user1.name = "Siva";
//		user1.email = "vishvajith257@gmail.com";
//		user1.password = "siva123";
//		user1.address = " 2B,Munayaduvar Nayanar Street,Palayamkottai-627002";
//		user1.mobileNo = 8852729367L;
//		user1.accNo = 4578331720l;
//		user1.balance = 50000;
//		user1.blockedAcc = false;
//
//	}

	/**
	 * Test Case for Successful Deposit
	 */
	@Test
	public void isDepositAmountSuccess() {
	// UserManagement.registerDetails("siva", "siva@gmail.com", "siva@123", "palatamankkd", 9361363167l, 98249824897l, 50000);
		
	    User user = new User();
	    user.balance=50000;
		float amount = 5000.33f;
		TransactionManagement.depositAmount(user, amount);
		assertEquals(55000f, user.balance,0);

	}

	/**
	 * Test Case for Failed Deposit
	 */
	@Test
	public void isDepositFailed() {

		//UserManagement.registerDetails(user1);// Adding user details in ArrayList
		
		float amount = -5000.98f;// amount to deposit
		 User user = new User();
		    user.balance=50000f;
		try {
			TransactionManagement.depositAmount(user, amount);// deposit function
			fail();
		} catch (RuntimeException e) {
			assertEquals("Enter a valid amount", e.getMessage());
			assertEquals(50000, user.balance);
		}

	}

}
