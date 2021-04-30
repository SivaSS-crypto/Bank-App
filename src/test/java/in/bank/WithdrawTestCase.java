package in.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class WithdrawTestCase {
	/**
	 * Test Case for successful amount withdrawal
	 */
	@Test
	public void isWithdrawAmountSuccess() {
		User user2 = new User();
		user2.name = "Kumar";
		user2.email = "viswakumar@gmail.com";
		user2.password = "kumar158";
		user2.address = "41/4,Anna Nagar, Chennai-6000028";
		user2.mobileNo = 7376362899l;
		user2.balance = 25000l;
		user2.accNo = 4578331721l;
		user2.blockedAcc = false;
		UserManagement.userList(user2);// Adding user2 details in ArrayList
		UserManagement.displayUser();// display the user details before withdrawal
		int amount = 500; // amount to withdraw
		TransactionManagement.withdrawAmount(user2, amount);// withdrawal function
		System.out.println("---Details After Withdraw Process--");
		UserManagement.displayUser(); // display user details after withdrawal
		boolean valid = TransactionManagement.withdrawAmount(user2, amount);
		assertTrue(valid);

	}

	/**
	 * Test case for failure amount withdrawal
	 */
	@Test
	public void isWithdrawAmountFailed() {
		User user2 = new User();
		user2.name = "Kumar";
		user2.email = "viswakumar@gmail.com";
		user2.password = "kumar158";
		user2.address = "41/4,Anna Nagar, Chennai-6000028";
		user2.mobileNo = 7376362899l;
		user2.balance = 25l;
		user2.accNo = 4578331721l;
		user2.blockedAcc = false;
		UserManagement.userList(user2);// Adding user2 details in ArrayList
		UserManagement.displayUser();// Display user details before withdrawal
		int amount = 500;
		TransactionManagement.withdrawAmount(user2, amount);// Withdrawal function
		System.out.println("---Details After Withdraw Process--");
		UserManagement.displayUser();// Display user details after withdrawal
		boolean valid = TransactionManagement.withdrawAmount(user2, amount);
		assertFalse(valid);

	}

}
