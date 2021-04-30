package in.bank;

import org.junit.Test;

public class DisplayUserTest {
	/**
	 * To display All User Details
	 */

	@Test
	public void displayUserDetails() {
		// user1 details
		User user1 = new User();
		user1.name = "Siva";
		user1.email = "vishvajith257@gmail.com";
		user1.password = "siva123";
		user1.address = " 2B,Munayaduvar Nayanar Street,Palayamkottai-627002";
		user1.mobileNo = 8852729367L;
		user1.accNo = 4578331720l;
		user1.balance = 50000l;
		user1.blockedAcc = false;
		UserManagement.userList(user1);// Adding user1 details to Array list

		// user2 details
		User user2 = new User();
		user2.name = "Kumar";
		user2.email = "viswakumar@gmail.com";
		user2.password = "kumar158";
		user2.address = "41/4,Anna Nagar, Chennai-6000028";
		user2.mobileNo = 7376362899l;
		user2.balance = 25000l;
		user2.accNo = 4578331721l;
		user2.blockedAcc = false;
		UserManagement.userList(user2); // Adding user2 details to Array list
		// user3 details
		User user3 = new User();
		user3.name = "Ponram";
		user3.email = "ponram@gmail.com";
		user3.password = "ponram";
		user3.address = "2A,Ambedkar Nagar,Sathankulam-628704";
		user3.mobileNo = 8798765644L;
		user3.balance = 100000l;
		user3.accNo = 4578331722l;
		user3.blockedAcc = false;
		UserManagement.userList(user3);// Adding user3 details to Array List
		UserManagement.displayAllUsers();// Display All user details

	}

}
