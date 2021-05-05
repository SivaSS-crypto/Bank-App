package in.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordValidation {
	/**
	 * Test case for password validation
	 */
	@Test
	public void isPasswordValidated() {
		String password = "Siva@123123";// correct password format holding variable
		boolean valid = UserManagement.passwordValidation(password);// validating password
		assertTrue(valid);

	}

	@Test
	public void isPasswordNotValidated() {
		String password = "Sivaiuuh";// wrong password format holding variable
		boolean valid = UserManagement.passwordValidation(password);
		assertFalse(valid);

	}

	@Test
	public void isPasswordNull() {
		String password = "  "; // null password
		boolean valid = UserManagement.passwordValidation(password);
		assertFalse(valid);

	}
}
