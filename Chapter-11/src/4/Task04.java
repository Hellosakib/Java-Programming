public class Task04 {

	public static void main(String[] args) {
		
		Account account = new Account(); //Create a "account" object
	
		account.setId(1122);
		account.setBalance(20);
		
		account.setAnnualInterestRate(4.5);
		
		account.withdraw(2000);
		account.deposit(3000);
		
		System.out.println("Account Statement is:\n");
		System.out.println("Account ID: " + account.getId());
		System.out.println("Date created: " + account.getDateCreated());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", account.getMonthlyInterest());
	}

}
