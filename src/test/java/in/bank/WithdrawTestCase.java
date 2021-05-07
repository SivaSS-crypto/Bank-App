package in.bank;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class WithdrawTestCase {

	User user2 = null;

	@Before
	public void setup() {
		System.out.println("##### setup ######");
		user2 = new User();
		user2.name = "Kumar";
		user2.email = "viswakumar@gmail.com";
		user2.password = "kumar158";
		user2.address = "41/4,Anna Nagar, Chennai-6000028";
		user2.mobileNo = 7362899l;
		user2.balance = 20000l;
		user2.accNo = 7654356789l;
		user2.blockedAcc = false;
	}

	/**
	 * Test Case for successful amount withdrawal
	 */
	@Test
	public void isWithdrawAmountSuccess() {

		// User user2 = UserManagement.userDetails();
		UserManagement.userDetails(user2);// Adding user2 details in ArrayList
		UserManagement.displayUser(user2);// display the user details before withdrawal
		int amount = 500; // amount to withdraw
		System.out.println("---Details After Withdraw Process--");
		TransactionManagement.withdrawAmount(user2, amount);// withdraw(accNo1, accNo2, 1000);
		UserManagement.displayUser(user2);// display user details after withdrawal
		assertEquals(19500, user2.balance);

	}

	/**
	 * Test case for failure amount withdrawal
	 */
	@Test
	public void isWithdrawAmountFailed() {

		UserManagement.userDetails(user2);// Adding user2 details in ArrayList

		int amount = 500000;
		// Withdrawal function
		System.out.println("---Details After Withdraw Process--");
		try {
			TransactionManagement.withdrawAmount(user2, amount);
			fail();

		} catch (RuntimeException e) {
			assertEquals("Insufficient Balance", e.getMessage());
			assertEquals(20000, user2.balance);
		}

	}

}
