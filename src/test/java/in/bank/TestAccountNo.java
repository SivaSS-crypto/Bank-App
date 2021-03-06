package in.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAccountNo {
/**
 * Test Case for correct account number
 */
	@Test
	public void correctAccountNo() {
//		User user1 = new User();
//		user1.name = "Siva";
//		user1.email = "vishvajith257@gmail.com";
//		user1.password = "siva123";
//		user1.address = " 2B,Munayaduvar Nayanar Street,Palayamkottai-627002";
//		user1.mobileNo = 885272936712L;
//		user1.accNo = 4578331720l;
//		user1.balance = 50000l;
//		user1.blockedAcc = false;
		long userAccNo = 1;
		//UserManagement.userDetails(user1);//adding user details in ArrayList
		boolean valid = TransactionManagement.validateAccount(userAccNo);
		assertTrue(valid);
	}
	/**
	 * Test case for Wrong account number
	 */

	@Test
	public void wrongAccountNo() {

//		User user1 = new User();
//		user1.name = "Siva";
//		user1.email = "vishvajith257@gmail.com";
//		user1.password = "siva123";
//		user1.address = " 2B,Munayaduvar Nayanar Street,Palayamkottai-627002";
//		user1.mobileNo = 885272936712L;
//		user1.accNo = 4578331720l;
//		user1.balance = 50000l;
//		user1.blockedAcc = false;
		long userAccNo = 2;
		//UserManagement.userDetails(user1); //Adding user details in ArrayList
		boolean valid = TransactionManagement.validateAccount(userAccNo);
		assertFalse(valid);
	}
}
