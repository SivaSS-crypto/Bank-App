package in.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNameValidation {
	/**
	 * Test Cases for User Name validation
	 */
	@Test
	public void isNameValidated() {

		String name = "Siva";// Correct name format variable
		boolean valid = Validation.nameValidation(name);// Name validation
		assertTrue(valid);

	}

	@Test
	public void isNameNotValid() {
		String name = "1234";// Wrong name format variable
		boolean valid = Validation.nameValidation(name);
		assertFalse(valid);

	}

	@Test
	public void isNameNull() {
		String name = "    ";// Null name
		boolean valid = Validation.passwordValidation(name);
		assertFalse(valid);

	}

}
