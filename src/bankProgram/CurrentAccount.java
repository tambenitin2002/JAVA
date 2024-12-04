package bankProgram;

public class CurrentAccount implements Account {

	// CurrentAccount.java
	// Class CurrentAccount

	// Declare the CurrentAccount class, which implements the Account interface
	    // Declare private instance variables to store balance and overdraft limit
	    private double balance;
	    private double overdraftLimit;

	    // Constructor for initializing the balance and overdraft limit
	    public CurrentAccount(double initialDeposit, double overdraftLimit) {
	        this.balance = initialDeposit;
	        this.overdraftLimit = overdraftLimit;
	    }

	    // Implement the "deposit" method to add a specified amount to the balance
	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	    }

	    // Implement the "withdraw" method to subtract a specified amount from the balance
	    @Override
	    public void withdraw(double amount) {
	        // Check if the balance plus overdraft limit is sufficient to cover the withdrawal
	        if (balance + overdraftLimit >= amount) {
	            balance -= amount;
	        }
	    }

	    // Implement the "getBalance" method to retrieve the current balance
	    @Override
	    public double getBalance() {
	        return balance;
	    }

	    // Method to set the overdraft limit for the current account
	    public void setOverdraftLimit(double overdraftLimit) {
	        this.overdraftLimit = overdraftLimit;
	    }
	}


