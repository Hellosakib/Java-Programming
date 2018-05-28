import java.util.Date;
public class Account {
	
	private int id=0;
	private double balance =0;
	private double annualInterestRate =0;
	private Date dateCreated = new Date();
	
	Account(){	
	}
	
	Account(int id , double balance){
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}
	//ID
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//Balance
	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//Annual rate
	public double getAnnualInterestRate() {
		return this.annualInterestRate = annualInterestRate;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	public String getDateCreated() {
		return dateCreated.toString();
	}

	// Return monthly interest rate 
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	// Methods
	// Return monthly interest 
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	//Withdraw
	public void withdraw(double amount) {
		balance -= amount;
	}

	//Deposite
	public void deposit(double amount) {
		balance += amount;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
