package in.bank;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DepositTestCase {
	User user1 = null;

	@Before

	public void startup() {
		user1 = new User();
		user1.name = "Siva";
		user1.email = "vishvajith257@gmail.com";
		user1.password = "siva123";
		user1.address = " 2B,Munayaduvar Nayanar Street,Palayamkottai-627002";
		user1.mobileNo = 8852729367L;
		user1.accNo = 4578331720l;
		user1.balance = 50000l;
		user1.blockedAcc = false;

	}

	/**
	 * Test Case for Successful Deposit
	 */
	@Test
	public void isDepositAmountSuccess() {
		UserManagement.userList(user1);
		UserManagement.displayUser(user1);// User details before deposit
		int amount = 5000;
		TransactionManagement.depositAmount(user1, amount);
		System.out.println("-- Details After Deposit--");
		UserManagement.displayUser(user1); // User details after deposit
		assertEquals(55000, user1.balance);

	}

	/**
	 * Test Case for Failed Deposit
	 */
	@Test
	public void isDepositFailed() {

		UserManagement.userList(user1);// Adding user details in ArrayList
		UserManagement.displayUser(user1);// display user details before deposit
		int amount = -5000;// amount to deposit
		System.out.println("-- Details After Deposit--");
		try {
			TransactionManagement.depositAmount(user1, amount);// deposit function
			//fail();
		} catch (RuntimeException e) {
			assertEquals("Enter a valid amount", e.getMessage());
			assertEquals(50000, user1.balance);
		}

	}

}
