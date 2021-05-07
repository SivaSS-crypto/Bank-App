package in.bank;

public class TransactionManagement {

	//MAp ( accountNo, List< transaction> 
	// DEBIT - Rs.1000
	// CREDIT =- Rs.12000
	// Mone
	/**
	 * Deposit an Amount for User account
	 * 
	 * @param user   // details of user
	 * @param amount // amount to deposit
	 */

	public static void depositAmount(User user, double amount) {

		if (amount != 0 && amount > 0) {
			for (User deposit : UserManagement.userList) {
				if (deposit.accNo == user.accNo) {

					user.balance = amount + user.balance;// deposit calculation
					break;

				}

			}
		} else {

			throw new RuntimeException("Enter a valid amount");

		}
	}

	/**
	 * Withdraw an Amount from User2 account
	 * 
	 * @param user2  //details of user2
	 * @param amount //amount to withdraw
	 */
	public static boolean withdrawAmount(User user, float amount) {
		boolean valid = false;

		for (User withdraw : UserManagement.userList) {
			if (user.balance > amount && amount > 0) {
				if (withdraw.accNo == user.accNo) {

					user.balance = user.balance - amount;// withdrawing calculation
					valid = true;
					break;
				}

			} else {

				throw new RuntimeException("Insufficient Balance");
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

	public static boolean validateAccount(long accNo) {
		boolean valid = false;
		for (User accountNo : UserManagement.userList) {
			if (accountNo.accNo == accNo) {

				valid = true;
				break;
			}
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
	public static void transferAmount(User user1, User user2, float amount) {
		if (amount < user1.balance) {
			TransactionManagement.withdrawAmount(user1, amount);
			TransactionManagement.depositAmount(user2, amount);
			
		} else {
			throw new RuntimeException("Insufficient balance to transfer money");
		}
	}

}
