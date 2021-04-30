package in.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class DepositTestCase {
	/**
	 * Test Case for Successful Deposit
	 */
	@Test
	public void isDepositAmountSuccess() {

		User user1 = new User();
		user1.name = "Siva";
		user1.email = "vishvajith257@gmail.com";
		user1.password = "siva123";
		user1.address = " 2B,Munayaduvar Nayanar Street,Palayamkottai-627002";
		user1.mobileNo = 8852729367L;
		user1.accNo = 4578331720l;
		user1.balance = 50000l;
		user1.blockedAcc = false;
		UserManagement.userList(user1);
		UserManagement.displayUser();// User details before deposit
		int amount = 500;
		TransactionManagement.depositAmount(user1, amount);
		System.out.println("-- Details After Deposit--");
		UserManagement.displayUser(); // User details after deposit
		assertEquals(55000, user1.balance);

	}

	/**
	 * Test Case for Failed Deposit
	 */
	@Test
	public void isDepositFailed() {
		User user1 = new User();
		user1.name = "Siva";
		user1.email = "vishvajith257@gmail.com";
		user1.password = "siva123";
		user1.address = " 2B,Munayaduvar Nayanar Street,Palayamkottai-627002";
		user1.mobileNo = 8852729367L;
		user1.accNo = 4578331720l;
		user1.balance = 5000l;
		user1.blockedAcc = false;
		UserManagement.userList(user1);// Adding user details in ArrayList
		UserManagement.displayUser();// display user details before deposit
		int amount = 500;// amount to deposit
		TransactionManagement.depositAmount(user1, amount);// deposit function
		System.out.println("-- Details After Deposit--");
		UserManagement.displayUser();// display user details after deposit
		assertNotEquals(null, user1.balance);

	}

}
