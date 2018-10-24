
public class Account {

	private int serialNumber;
	private float balance;
	private static float annualInterestRate = 0.03f;
	private static int lastSerialNumber = 0;

	// Default Constructor with 0 balance
	public Account() {
		serialNumber = lastSerialNumber++;
		balance = 0.0f;
	}

	// Constructor to initialize a bank account with an existing balance
	public Account(float balance) {
		serialNumber = lastSerialNumber++;
		this.balance = balance;
	}

	// returns the current annual interest rate
	public static float getAnnualInterestRate() {
		return annualInterestRate;
	}

	// sets the annual interest rate for all instances
	public static void setAnnualInterestRate(float annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	// calculate the half year interests for current account balance
	public float calcHalfYearInterest() {
		return balance * (annualInterestRate / 2);
	}

	// add money to the account
	public void deposit(float amount) {
		if (amount >= 0) {
			balance += amount;
		}
	}

	// remove money from the account
	public void withdraw(float amount) {
		if (amount >= 0) {
			balance -= amount;
		}
	}
	
	/*
	 * Output all the necessary details of the account. Such as 
	 * - serial number 
	 * - balance
	 * - annual interest rate
	 */
	public void printState() {
		System.out.println("Account [serialNumber=" + serialNumber + ", balance=" + balance + ", interest= "
				+ annualInterestRate + "]");
	}
}
