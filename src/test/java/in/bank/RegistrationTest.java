package in.bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegistrationTest {

	@Test
	public void test() {
		boolean valid = UserManagement.registerDetails("siva", "siva@gmail.com", "siva@123", "palatamankkd", 9361363167l, 98249824897l, 50000);
		; 
		assertTrue(valid);
	}
	@Test
	public void test1() {
		boolean valid = UserManagement.registerDetails(" ", "arunmai.company", " ", "krishnapuram", 932l, 1223332221l, 12000);
		assertTrue(valid);
	}
}

//UserManagement.displayAllUsers();
//int size = UserManagement.userList.size();
//System.out.println(size)