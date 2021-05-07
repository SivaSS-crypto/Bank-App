package in.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPasswordValidation {
	/**
	 * Test case for password validation
	 */
	@Test
	public void isPasswordValidated() {
		String password = "Siva@123123";// correct password format holding variable
		boolean valid = Validation.passwordValidation(password);// validating password
		assertTrue(valid);

	}

	@Test
	public void isPasswordNotValidated() {
		String password = "Sivaiuuh";// wrong password format holding variable
		boolean valid = Validation.passwordValidation(password);
		assertFalse(valid);

	}

	@Test
	public void isPasswordNull() {
		String password = "  "; // password is null
		boolean valid = Validation.passwordValidation(password);
		assertFalse(valid);

	}
}
