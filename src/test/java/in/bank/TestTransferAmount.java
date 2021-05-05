package in.bank;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTransferAmount {
	User user1 = null;
	User user2 = null;

	@Before
	public void startup() {
		user1 = new User();
		user1.name = "Siva";
		user1.email = "vishvajith257@gmail.com";
		user1.password = "siva123";
		user1.address = " 2B,Munayaduvar Nayanar Street,Palayamkottai-627002";
		user1.mobileNo = 885272936712L;
		user1.accNo = 4578331720l;
		user1.balance = 50000l;
		// Adding the user details in ArrayList

		// Details of second user
		user2 = new User();
		user2.name = "Ponram";
		user2.email = "ponram@gmail.com";
		user2.password = "ponram";
		user2.address = "2A,Ambedkar Nagar,Sathankulam-628704";
		user2.mobileNo = 8798765644L;
		user2.balance = 10000l;
		user2.accNo = 4578331722l;

	}

	/**
	 * Test case for successful Transfer
	 */
	@Test
	public void isTransferAmountSuccess() {
		UserManagement.userList(user1);
		UserManagement.userList(user2);

		int amount = 5000;
		TransactionManagement.transferAmount(user1, user2, amount); // Transfer amount calculation

		assertEquals(45000, user1.balance);
		assertEquals(15000, user2.balance);

	}

	@Test
	public void isTransferAmountFailed() {

		UserManagement.userList(user1);
		UserManagement.userList(user2);
		int amount = 500000;
		try {
			TransactionManagement.transferAmount(user1, user2, amount); // Transfer amount calculation
		} catch (RuntimeException e) {
			assertEquals("Insufficient balance to transfer money", e.getMessage());
			assertEquals(50000, user1.balance);
			assertEquals(10000, user2.balance);
		}
	}

}
