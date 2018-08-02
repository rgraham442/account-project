package accountapplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

public class Service {
	
	private static HashMap<Integer, Account> accountMap = new HashMap<>();
	
	private JSONObject jsonMap;
	
	private int count;
	
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
				increaseCount();
				System.out.print("------------\nResults returned: " + count + "\n------------\n");
				return entry.getValue().getFirstName();
			}						
		}
		return null;
	}
	
	public List<Account> retrieveAccountFirstName(String firstName) {
		this.count = 0;
		ArrayList<Account> holder = new ArrayList<>();
		
		for (Map.Entry<Integer, Account> entry : accountMap.entrySet()) {
			if (entry.getValue().getFirstName().equals(firstName)) {
				System.out.println("Account Number: " + entry.getKey() + "\n"
						+ "Account Name: " + entry.getValue().getFirstName() + " "
						+ entry.getValue().getLastName() + "\n");
				increaseCount();
				holder.add(entry.getValue());
			}
		}
		System.out.print("------------\nResults returned: " + count + "\n------------\n");
		return holder;
	}
	
	public List<Account>  retrieveAccountLastName(String lastName) {
		this.count = 0;
		ArrayList<Account> holder = new ArrayList<>();
		
		for (Map.Entry<Integer, Account> entry : accountMap.entrySet()) {
			if (entry.getValue().getLastName().equals(lastName)) {
				System.out.println("Account Number: " + entry.getKey() + "\n"
						+ "Account Name: " + entry.getValue().getFirstName() + " "
						+ entry.getValue().getLastName() + "\n");
				increaseCount();
				holder.add(entry.getValue());
			}
		}
		System.out.print("------------\nResults returned: " + count + "\n------------\n");
		return holder;
	}
	
	public Map<Integer, Account> getAccountMap() {
		return accountMap;
	}
	
	public JSONObject getJSON() {
		return jsonMap;
	}
	
	public void increaseCount() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
}
