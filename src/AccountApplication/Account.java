package AccountApplication;

public class Account {
	
	private String firstName = "";
	private String lastName = "";
	private int accountNumber;
	
	public Account () {
		
	}
	
	public Account (int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	

}
