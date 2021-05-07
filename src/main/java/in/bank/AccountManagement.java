package in.bank;

public class AccountManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserManagement.displayAllUsers();
		boolean valid = UserManagement.loginValidation("Siva", "Siva@123");
		System.out.println(valid);
	
		 UserManagement.getAllUsers();
	}

}
