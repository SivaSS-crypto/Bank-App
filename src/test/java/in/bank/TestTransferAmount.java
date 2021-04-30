package in.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTransferAmount {

	/**
	 * Test case for successful Transfer
	 */
	@Test
	public void isTransferAmountSuccess() {
		// Details of first user
		User user1 = new User();
		user1.name = "Siva";
		user1.email = "vishvajith257@gmail.com";
		user1.password = "siva123";
		user1.address = " 2B,Munayaduvar Nayanar Street,Palayamkottai-627002";
		user1.mobileNo = 885272936712L;
		user1.accNo = 4578331720l;
		user1.balance = 500000l;
		UserManagement.userList(user1); // Adding the user details in ArrayList

		// Details of second user
		User user2 = new User();
		user2.name = "Ponram";
		user2.email = "ponram@gmail.com";
		user2.password = "ponram";
		user2.address = "2A,Ambedkar Nagar,Sathankulam-628704";
		user2.mobileNo = 8798765644L;
		user2.balance = 100000l;
		user2.accNo = 4578331722l;
		UserManagement.userList(user2);// Adding the user details in the Array List
		int amount = 50000;
		TransactionManagement.transferAmount(user1, user2, amount); // Transfer amount calculation

		assertEquals(450000, user1.balance);
		assertEquals(150000, user2.balance);

	}

	@Test
	public void isTransferAmountFailed() {
		// Details of first user
		User user1 = new User();
		user1.name = "Siva";
		user1.email = "vishvajith257@gmail.com";
		user1.password = "siva123";
		user1.address = " 2B,Munayaduvar Nayanar Street,Palayamkottai-627002";
		user1.mobileNo = 885272936712L;
		user1.accNo = 4578331720l;
		user1.balance = 50000l;
		UserManagement.userList(user1); // Adding the user details in ArrayList

		// Details of second user
		User user2 = new User();
		user2.name = "Ponram";
		user2.email = "ponram@gmail.com";
		user2.password = "ponram";
		user2.address = "2A,Ambedkar Nagar,Sathankulam-628704";
		user2.mobileNo = 8798765644L;
		user2.balance = 100000l;
		user2.accNo = 4578331722l;
		UserManagement.userList(user2);// Adding the user details in the Array List
		int amount = 50000;
		TransactionManagement.transferAmount(user1, user2, amount); // Transfer amount calculation
		assertNotEquals(1000, user1.balance);
		assertNotEquals(100500, user2.balance);

	}

}
