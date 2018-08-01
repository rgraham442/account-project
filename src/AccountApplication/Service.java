package AccountApplication;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONML;
import org.json.JSONObject;

public class Service {
	
	public HashMap<Integer, Account> accountMap = new HashMap<Integer, Account>();
	
	private JSONObject jsonMap;
	
	public void addToMap(Account account) {
		accountMap.put(account.getAccountNumber(), account);
		jsonMap = new JSONObject(accountMap);
	}
	
	public String retrieveAccountNumber(int accountNumber) {
		for (Map.Entry<Integer, Account> entry : accountMap.entrySet()) {
			if (entry.getKey() == accountNumber) {
				System.out.println("Account Number: " + entry.getKey() + "\n"
						+ "Account Name: " + entry.getValue().getFirstName() + " "
						+ entry.getValue().getLastName() + "\n");
				return entry.getValue().getFirstName();
			}						
		}
		return null;
	}
	
	public String retrieveAccountFirstName(String firstName) {
		for (Map.Entry<Integer, Account> entry : accountMap.entrySet()) {
			if (entry.getValue().getFirstName() == firstName) {
				System.out.println("Account Number: " + entry.getKey() + "\n"
						+ "Account Name: " + entry.getValue().getFirstName() + " "
						+ entry.getValue().getLastName() + "\n");
				return entry.getValue().getLastName();
			}						
		}
		return null;
	}
	
	public String retrieveAccountLastName(String lastName) {
		for (Map.Entry<Integer, Account> entry : accountMap.entrySet()) {
			if (entry.getValue().getLastName() == lastName) {
				System.out.println("Account Number: " + entry.getKey() + "\n"
						+ "Account Name: " + entry.getValue().getFirstName() + " "
						+ entry.getValue().getLastName() + "\n");
				return entry.getValue().getFirstName();
			}						
		}
		return null;
	}
	
	public Map getAccountMap() {
		return accountMap;
	}
	
	public JSONObject getJSON() {
		return jsonMap;
	}

}
