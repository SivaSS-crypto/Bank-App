package in.bank;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAppTest {

	@Test
	public void correctUsernameandPassword() {
		String userName = "Siva";
		String password = "Siva@123";
		boolean valid = UserManagement.Login(userName, password);
		assertTrue(valid);

	}

	@Test
	public void correctUsernamewrongPassword() {
		String userName = "Siva";
		String password = "1234";
		boolean valid = UserManagement.Login(userName, password);
		assertFalse(valid);
	}

	@Test
	public void correctPasswordwrongUsername() {
		String userName = "Arun";
		String password = "Siva@123";
		boolean valid = UserManagement.Login(userName, password);
		assertFalse(valid);
	}

	@Test
	public void wrongUsernameandPassword() {
		String userName = "Siva21";
		String password = "Si123";
		boolean valid = UserManagement.Login(userName, password);
		assertFalse(valid);
	}

}
