package in.bank;

import java.util.ArrayList;

public class UserManagement {

	public static ArrayList<User> users = new ArrayList<User>(); // Creating a new ArrayList

	public static void userList(User list) {
		users.add(list); //Adding the user details in the ArrayList

	}

	/**
	 * Login using userName and user password
	 * 
	 * @param userName     // name of the user
	 * @param userPassword // own password of user
	 * @return
	 */

	public static boolean Login(String userName, String userPassword) {

		boolean valid = false;
		// Condition for validating username and password
		if (userName.equals("siva") && userPassword.equals("1234")) {

			valid = true;
		}

		return valid;
	}

	/**
	 * Display the Details of User1
	 */
	public static void displayUser() {
		// for each loop to display the user1 details
		for (User dis : UserManagement.users) {
			System.out.println("Name:" + dis.name);
			System.out.println("Address:" + dis.address);
			System.out.println("Mobile:" + dis.mobileNo);
			System.out.println("Email Id:" + dis.email);
			System.out.println("Your Balance Amount:" + dis.balance);
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
		String value = "Your account is valid";
		if (user.blockedAcc) {
			value = "Your account is blocked";
		}
		return value;
	}

}
