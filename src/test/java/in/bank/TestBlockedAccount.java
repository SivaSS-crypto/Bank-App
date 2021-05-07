package in.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBlockedAccount {

	@Test
	/**
	 * Test case to check if the account is blocked
	 */
	public void isAccountBlocked() {
		// details of user2
//		User user2 = new User();
//		user2.name = "Kumar";
//		user2.email = "viswakumar@gmail.com";
//		user2.password = "kumar158";
//		user2.address = "41/4,Anna Nagar, Chennai-6000028";
//		user2.mobileNo = 7376362899l;
//		user2.balance = 25000l;
//		user2.accNo = 4578331721l;
//		user2.blockedAcc = true;
//		UserManagement.userDetails(user2); // Adding the details in ArrayList
		String value = UserManagement.accountStatus(1); // Getting value from accountStatus
		assertEquals("Your account is blocked", value);
	}

	/**
	 * Test case to check if account is not blocked
	 */
	@Test
	public void isAccountNotBlocked() {
		// details of user2
		User user2 = new User();
		user2.name = "Kumar";
		user2.email = "viswakumar@gmail.com";
		user2.password = "kumar158";
		user2.address = "41/4,Anna Nagar, Chennai-6000028";
		user2.mobileNo = 7376362899l;
		user2.balance = 25000l;
		user2.accNo = 4578331721l;
		user2.blockedAcc = false;
		UserManagement.userDetails(user2); // Adding the details to ArrayList
		String value = UserManagement.accountStatus(user2); // Getting the value from accountStatus
		assertNotEquals("Your account is  blocked", value);
	}

}
