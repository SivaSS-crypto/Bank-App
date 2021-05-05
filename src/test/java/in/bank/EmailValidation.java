package in.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailValidation {
	/**
	 * Test Cases for Email Validation
	 */
	@Test
	public void isEmailValidated() {

		String email = "vishvajith257@gmail.com";// Correct Email format variable
		boolean valid = UserManagement.emailValidation(email);// Email validation
		assertTrue(valid);

	}

	@Test
	public void isEmailNotValidated() {

		String email = "vishvajith257gmail";// Wrong format of Email
		boolean valid = UserManagement.emailValidation(email);
		assertFalse(valid);

	}

	@Test
	public void isEmailNull() {

		String email = " "; // Null Email
		boolean valid = UserManagement.emailValidation(email);
		assertFalse(valid);

	}
}
