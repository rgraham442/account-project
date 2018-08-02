package accountapplicationtest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import accountapplication.Account;
import accountapplication.Service;

public class ServiceTest {
	
	@Test
	public void mapNullTest() {
		Service service = new Service();
		assertNotNull("The Map is null;", service.getAccountMap());
	}
	
	@Test
	public void mapAccountNumberNullTest() {
		Service service = new Service();
		
		Account account = new Account();
		service.addToMap(account);
		
		assertEquals("Doesn't come back null", service.retrieveAccountNumber(10),null);
	}
	
	@Test
	public void mapAccountNumberTest() {
		Service service = new Service();
		
		Account account = new Account(10);
		account.setFirstName("Hugh");
		account.setLastName("Mann");
		service.addToMap(account);
		
		assertEquals("That account number was not found", service.retrieveAccountNumber(10),"Hugh");
	}
	
	@Test
	public void mapAccountFirstNameTest() {
		Service service = new Service();
		
		Account account = new Account(10);
		account.setFirstName("Hugh");
		account.setLastName("Mann");
		service.addToMap(account);
		
		assertEquals("That account name was not found", service.retrieveAccountFirstName("Hugh").get(0).getFirstName(),"Hugh");
	}
	
	@Test
	public void mapAccountLastNameTest() {
		Service service = new Service();
		
		Account account = new Account(10);
		account.setFirstName("Hugh");
		account.setLastName("Mann");
		service.addToMap(account);
		
		assertEquals("That account last name was not found", service.retrieveAccountLastName("Mann").get(0).getLastName(),"Mann");
	}
	
	@Test
	public void jsonMapTest() {
		Service service = new Service();
		
		Account account = new Account(10);
		account.setFirstName("Hugh");
		account.setLastName("Mann");
		service.addToMap(account);
		
		assertNotNull("The json object was not found", service.getJSON());
	}
	
	@Test
	public void countStartTest() {
		Service service = new Service();
		
		Account account = new Account(10);
		account.setFirstName("Hugh");
		account.setLastName("Mann");
		service.addToMap(account);
		
		service.retrieveAccountFirstName("Hugh");
		
		assertEquals("The count was not increased", service.getCount(),1);
	}
	
	@Test
	public void countEmptyTest() {
		Service service = new Service();
		
		assertEquals("The count was not zero", service.getCount(),0);
	}
	
	@Test
	public void countMultipleTest() {
		Service service = new Service();
		
		Account hugh = new Account(42);
		hugh.setFirstName("Hugh");
		hugh.setLastName("Mann");
		service.addToMap(hugh);
		
		Account argon = new Account(42);
		argon.setFirstName("Hugh");
		argon.setLastName("Argon");
		service.addToMap(argon);
		
		service.retrieveAccountFirstName("Hugh");
		assertEquals("The count was not increased enough", service.getCount(),2);
	}
	
	

}
