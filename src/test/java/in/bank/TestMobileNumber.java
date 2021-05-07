package in.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMobileNumber {

	@Test
	public void isMobileNumberValidated() {

		String mobileNo = "9789231919";
		boolean valid = Validation.mobileNumberValidation(mobileNo);
		assertTrue(valid);

	}

	@Test
	public void isMobileNumberNotValidated() {
		String mobileNo = "sivasivass";
		boolean valid = Validation.mobileNumberValidation(mobileNo);
		assertFalse(valid);
	}

	@Test
	public void isMobileNumberNull() {
		String mobileNo = " ";
		boolean valid = Validation.mobileNumberValidation(mobileNo);
		assertFalse(valid);
	}

}
