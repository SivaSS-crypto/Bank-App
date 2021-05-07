package in.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAccountNumberValidation {

	@Test
	public void isAccountNumberValidated() {
		long accNo = 97834763631l;
		boolean valid = Validation.accountNumberValidation(accNo);
		assertTrue(valid);
	}

	@Test
	public void isAccountNumberNotValidated() {
		long accNo = 89234l;
		boolean valid = Validation.accountNumberValidation(accNo);
		assertFalse(valid);
	}

	@Test
	public void isAccountNumberNull() {
		long accNo = 0l;
		boolean valid = Validation.accountNumberValidation(accNo);
		assertFalse(valid);
	}
}
