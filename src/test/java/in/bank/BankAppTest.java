package in.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAppTest {

	// private static final User User = null;

	@Test
	public void correctUsernameandPassword() {
		boolean valid = UserManagement.Login("siva", "1234");
		assertEquals(true, valid);

	}

	@Test
	public void correctUsernamewrongPassword() {
		boolean valid = UserManagement.Login("siva", "abcd");
		assertEquals(false, valid);
	}

	@Test
	public void correctPasswordwrongUsername() {
		boolean valid = UserManagement.Login("shiva", "1234");
		assertEquals(false, valid);
	}

	@Test
	public void wrongUsernameandPassword() {
		boolean valid = UserManagement.Login("ponram", "abcd");
		assertEquals(false, valid);
	}

}
