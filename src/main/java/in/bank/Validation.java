package in.bank;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Validation {
	/**
	 * To validate the Users Email
	 * 
	 * @param email //Mail Id
	 * @return
	 */
	public static boolean emailValidation(String email) {

		// Email Pattern declaration
		String check = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
		// Business Logic
		if (email == null) {
			return false;
		}
		Pattern patternForEmail = Pattern.compile(check);
		Matcher matcherForEmail = patternForEmail.matcher(email);// Matches the pattern with the Email
		return matcherForEmail.matches();
	}

	/**
	 * To validate the Users Name
	 * 
	 * @param name // Name of user
	 * @return
	 */
	public static boolean nameValidation(String name) {

		// Name Pattern Declaration
		String regx = "[a-zA-Z]+\\.?";
		Pattern pattern = Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(name);// Matches the pattern with the name
		return matcher.find();

	}

	/**
	 * To validate password of the user
	 * 
	 * @param password //password chosen by the user
	 * @return
	 */
	public static boolean passwordValidation(String password) {

		// Password Pattern Declaration
		String check = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
		if (password == null) {
			return false;
		}
		Pattern passwordPattern = Pattern.compile(check);
		Matcher passwordMatcher = passwordPattern.matcher(password);// Matches the given pattern with the password
		return passwordMatcher.matches();

	}

	/**
	 * To validate mobile number of the user
	 * 
	 * @param mobileNo //mobile number given by the user
	 * @return
	 */
	public static boolean mobileNumberValidation(long mobileNo) {
        String mobile = Long.toString(mobileNo);
		String check = "^(\\+?\\d{1,4}[\\s-])?(?!0+\\s+,?$)\\d{10}\\s*,?$";
		Pattern numberPattern = Pattern.compile(check);
		Matcher numberMatcher = numberPattern.matcher(mobile); // Matches the given pattern with mobile no
		return numberMatcher.matches();
	}
	/**
	 * To validate the bank account number
	 * @param accountNo // account number of the user
	 * @return
	 */
	public static boolean accountNumberValidation(long accountNo) {
		String accNo = Long.toString(accountNo);

		String check = "[0-9]{9,18}";
		Pattern accPattern = Pattern.compile(check); // compiles the given pattern
		Matcher accMatcher = accPattern.matcher(accNo); // matches the given pattern with the account number
		return accMatcher.matches(); 

	}

}
