package in.bank;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManagement {
	public static ArrayList<User> users = new ArrayList<User>(); // Creating a new ArrayList

	static {
		User user1 = new User();
		user1.name = "Siva";
		user1.email = "vishvajith257@gmail.com";
		user1.password = "Siva@123";
		users.add(user1);

	}

	/**
	 * Add the user Details in ArrayList
	 * 
	 * @param list //Details of user
	 */
	public static void userList(User list) {

		users.add(list); // Adding the user details in the ArrayList

	}

	/**
	 * Login validation of user
	 * 
	 * @param userName     // Name of User
	 * @param userPassword // Password of User
	 * @return
	 */
	public static boolean Login(String userName, String userPassword) {

		boolean valid = false;

		for (User validation : UserManagement.users) {
			if (validation.name.equals(userName) && validation.password.equals(userPassword)) {

				valid = true;
				break;
			}

		}
		return valid;
	}

	/**
	 * Display the Details of User1
	 */
	public static void displayUser(User user) {
		// for each loop to display the user1 details
		for (User display : UserManagement.users) {
			if (display.accNo == user.accNo) {
				System.out.println("Name:" + display.name);
				System.out.println("Address:" + display.address);
				System.out.println("Mobile:" + display.mobileNo);
				System.out.println("Email Id:" + display.email);
				System.out.println("Your Balance Amount:" + display.balance);
				System.out.println("none");
				break;
			}
		}
	}

	/**
	 * Display All the Users detail
	 */

	public static void displayAllUsers() {
		for (User display : UserManagement.users) {

			System.out.println("Name:" + display.name);
			System.out.println("Address:" + display.address);
			System.out.println("Mobile:" + display.mobileNo);
			System.out.println("Email Id:" + display.email);
			System.out.println("Your Balance Amount:" + display.balance);

		}
	}

	/**
	 * To check if the account is active or blocked
	 * 
	 * @param user //details of the user
	 * @return
	 */
	public static String accountStatus(User user) {
		String value = "Your account is valid"; // String declaration
		if (user.blockedAcc) {
			value = "Your account is blocked";
		}
		return value;
	}

	/**
	 * To validate the Users Email
	 * 
	 * @param Email //Mail Id
	 * @return
	 */
	public static boolean emailValidation(String Email) {

		// Pattern declaration
		String check = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
		// Business Logic
		if (Email == null) {
			return false;
		}
		Pattern patternForEmail = Pattern.compile(check);
		Matcher matcherForEmail = patternForEmail.matcher(Email);
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
		Matcher matcher = pattern.matcher(name);
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
		Matcher passwordMatcher = passwordPattern.matcher(password);
		return passwordMatcher.matches();

	}

}
