package in.bank;

import java.util.ArrayList;

public class UserManagement {
	public static ArrayList<User> userList = new ArrayList<User>(); // Creating a new ArrayList

//	static {
//		User user1 = new User();
//		user1.accNo= 1;
//		user1.name = "Siva";
//		user1.email = "vishvajith257@gmail.com";
//		user1.password = "Siva@123";
//		user1.blockedAcc = false;
//		user1.balance = 10000;
//		userList.add(user1);
//		
//		User user2 = new User();
//		user2.accNo= 2;
//		user2.name = "Ramesh";
//		user2.email = "vishvajith257@gmail.com";
//		user2.password = "Siva@123";
//		user2.blockedAcc = true;
//		user2.balance = 50000;
//		userList.add(user2);
//	
//	}
	
	/**
	 * Add the user Details in ArrayList
	 * 
	 * @param list //Details of user
	 */
	public static boolean registerDetails(String name, String email, String password, String address, long mobileNo, long accNo, long balance)
	 {  boolean valid = false;
		if(
		Validation.accountNumberValidation(accNo)&&
		Validation.emailValidation(email)&&
		Validation.mobileNumberValidation(mobileNo)&&
		Validation.nameValidation(name)&&
		Validation.passwordValidation(password)) {
		
		
		
		User user = new User();
		user.name = name;
		user.email = email;
		user.password = password;
		user.address = address;
		user.mobileNo = mobileNo;
		user.accNo = accNo;
		user.balance = balance;
		userList.add(user);
		valid = true;
		return valid;
		}
		
		else
		{
			return valid;
		}
	 // Adding the user details in the ArrayList

	}

	/**
	 * Login validation of user
	 * 
	 * @param userName     // Name of User
	 * @param userPassword // Password of User
	 * @return
	 */
	public static boolean loginValidation(String userName, String userPassword) {

		boolean valid = false;
		Validation.nameValidation(userName);
		Validation.passwordValidation(userPassword);

		for (User validation : userList) {
			if (validation.name.equals(userName) && validation.password.equals(userPassword)) {

				valid = true;
				break;
			}

		}
		return valid;
	}

	
	/**
	 * Users in the ArrayList
	 * @return
	 */
	public static ArrayList<User> getAllUsers() {
		userList.size();
		return userList;
	}
	
	/**
	 * Display All the Users detail
	 */

	public static void displayAllUsers() {
		for (User display : userList) {

			System.out.println(
					"Name:" + display.name + "\n" + "Address:" + display.address + "\n" + "Mobile:" + display.mobileNo
							+ "\n" + "Email Id:" + display.email + "\n" + "Your Balance Amount:" + display.balance);

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
	 * To check if the account is active or blocked
	 * 
	 * @param user //details of the user
	 * @return
	 */
	public static String accountStatus(Long accountNo) {
		String value = "Your account is valid"; // String declaration
//		if (user.blockedAcc) {
//			value = "Your account is blocked";
//		}
		return value;
	}

}
