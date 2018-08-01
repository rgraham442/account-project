package AccountApplicationTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import AccountApplication.Account;
import AccountApplication.Service;

public class ServiceTest {
	
	@Test
	public void MapNullTest() {
		Service service = new Service();
		assertNotNull("The Map is null;", service.getAccountMap());
	}
	
	@Test
	public void MapAccountNumberNullTest() {
		Service service = new Service();
		
		Account account = new Account();
		service.addToMap(account);
		
		assertEquals("That account was not found", service.retrieveAccountNumber(10),null);
	}
	
	@Test
	public void MapAccountNumberTest() {
		Service service = new Service();
		
		Account account = new Account(10);
		account.setFirstName("Hugh");
		account.setLastName("Mann");
		service.addToMap(account);
		
		assertEquals("That account was not found", service.retrieveAccountNumber(10),"Hugh");
	}
	
	@Test
	public void MapAccountFirstNameNullTest() {
		Service service = new Service();
		
		Account account = new Account();
		service.addToMap(account);
		
		assertEquals("That account was not found", service.retrieveAccountFirstName("jim"),null);
	}
	
	@Test
	public void MapAccountFirstNameTest() {
		Service service = new Service();
		
		Account account = new Account(10);
		account.setFirstName("Hugh");
		account.setLastName("Mann");
		service.addToMap(account);
		
		assertEquals("That account was not found", service.retrieveAccountFirstName("Hugh"),"Mann");
	}
	
	@Test
	public void MapAccountLastNameNullTest() {
		Service service = new Service();
		
		Account account = new Account();
		service.addToMap(account);
		
		assertEquals("That account was not found", service.retrieveAccountLastName("jim"),null);
	}
	
	@Test
	public void MapAccountLastNameTest() {
		Service service = new Service();
		
		Account account = new Account(10);
		account.setFirstName("Hugh");
		account.setLastName("Mann");
		service.addToMap(account);
		
		assertEquals("That account was not found", service.retrieveAccountLastName("Mann"),"Hugh");
	}
	
	

}
