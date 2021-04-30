package in.bank;

public class TransactionManagement {

	/**
	 * Deposit an Amount for User account
	 * 
	 * @param user   // details of user
	 * @param amount // amount to deposit
	 */

	public static void depositAmount(User user, int amount) {
		int index = 0;

		for (User deposit : UserManagement.users) {
			if (deposit.accNo == user.accNo) {

				user.balance = amount + user.balance;// deposit calculation
				break;

			}
			index++;
			System.out.println(index);

		}
	}

	/**
	 * Withdraw an Amount from User2 account
	 * 
	 * @param user2  //details of user2
	 * @param amount //amount to withdraw
	 */
	public static boolean withdrawAmount(User user, int amount) {
		int index = 0;
		boolean valid = false;
		if (user.balance > amount && amount > 0) {
			for (User withdraw : UserManagement.users) {
				if (withdraw.accNo == user.accNo) {

					user.balance = user.balance - amount;// withdrawing calculation
					valid = true;
					break;
				}
				index++;
				System.out.println(index);
			}
		}

		return valid;
	}

	/**
	 * Validating an Users account
	 * 
	 * @param user // details of user
	 * @return
	 */

	public static boolean validateAccount(User user, long accNo) {
		boolean valid = false;
			if (accNo == user.accNo) {

				valid = true;
			}

		return valid;

	}

	/**
	 * Transferring amount from user1 to user2
	 * 
	 * @param user1  //details of user1
	 * @param user2  //details of user2
	 * @param amount //amount or transfer
	 */
	public static void transferAmount(User user1, User user2, int amount) {
		TransactionManagement.withdrawAmount(user1, amount);
		TransactionManagement.depositAmount(user2, amount);
		UserManagement.displayUser();// Display the details after transaction
	}

}
