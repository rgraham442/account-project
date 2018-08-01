package AccountApplication;

public class Main {
	
	public static void main (String[] args) {
		
		Service service = new Service();
		
		Account hugh = new Account(17);
		hugh.setFirstName("Hugh");
		hugh.setLastName("Mann");
		service.addToMap(hugh);
		
		Account alice = new Account(72);
		alice.setFirstName("Alice");
		alice.setLastName("Ren");
		service.addToMap(alice);
		
		Account bob = new Account(201);
		bob.setFirstName("Bob");
		bob.setLastName("Argon");
		service.addToMap(bob);
		
		service.retrieveAccountNumber(17);
		service.retrieveAccountFirstName("Bob");
		service.retrieveAccountLastName("Ren");
		
	}

}
