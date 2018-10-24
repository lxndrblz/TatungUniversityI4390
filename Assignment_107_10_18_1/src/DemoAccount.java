
public class DemoAccount {

	public static void main(String[] args) {
		// Create multiple instances of the bank account
		Account acc1 = new Account();
		Account acc2 = new Account(1000.00f);
		// Deposit 100 into the first account and print the balance
		acc1.deposit(100.00f);
		acc1.printState();
		// Calculate the half year interest
		System.out.println("Half Year Interest: " + acc1.calcHalfYearInterest());
		// Withdraw 10 from account
		acc1.withdraw(10.0f);
		// Check if updated interest rate applies correctly to both accounts
		Account.setAnnualInterestRate(0.05f);
		System.out.println("Half Year Interest: " + acc1.calcHalfYearInterest());
		System.out.println("Half Year Interest: " + acc2.calcHalfYearInterest());
		acc1.printState();
		acc2.printState();

	}

}
