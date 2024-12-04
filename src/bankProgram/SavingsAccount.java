package bankProgram;

public class SavingsAccount implements Account {
	// SavingsAccount.java
	// Class SavingsAccount

	// Declare the SavingsAccount class, which implements the Account interface
	
	    // Declare private instance variables to store balance and interest rate
	    private double balance;
	    private double interestRate;

	    // Constructor for initializing the balance and interest rate
	    public SavingsAccount(double initialDeposit, double interestRate) {
	        this.balance = initialDeposit;
	        this.interestRate = interestRate;
	    }

	    // Implement the "deposit" method to add a specified amount to the balance
	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	    }

	    // Implement the "withdraw" method to subtract a specified amount from the balance
	    @Override
	    public void withdraw(double amount) {
	        balance -= amount;
	    }

	    // Implement the "getBalance" method to retrieve the current balance
	    @Override
	    public double getBalance() {
	        return balance;
	    }
	   
	    // Method to apply interest to the balance
	    public void applyInterest() {
	        // Applying interest rate (in percentage) to the balance for 1 year
	        balance += balance * interestRate / 100;
	    }
	}


