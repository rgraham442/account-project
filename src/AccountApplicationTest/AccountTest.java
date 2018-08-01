package AccountApplicationTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import AccountApplication.Account;

public class AccountTest {
	
	@Test
	public void setFirstNameTest() {
		Account account = new Account();
		account.setFirstName("Hugh");
		assertEquals("That first name was not found", account.getFirstName(),"Hugh");
	}
	
	@Test
	public void setLastNameTest() {
		Account account = new Account();
		account.setLastName("Mann");
		assertEquals("That last name was not found", account.getLastName(),"Mann");
	}
	
	@Test
	public void constructAccountNumber() {
		Account account = new Account(1277);
		assertEquals("That account number was not found", account.getAccountNumber(),1277);
	}
	
	@Test
	public void setAccountNumberTest() {
		Account account = new Account();
		account.setAccountNumber(1277);
		assertEquals("That account number was not constructed", account.getAccountNumber(),1277);
	}

}
