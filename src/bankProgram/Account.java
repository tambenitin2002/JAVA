package bankProgram;

public interface Account {
	// Declare the abstract method "deposit" to deposit a specified amount
    void deposit(double amount);

    // Declare the abstract method "withdraw" to withdraw a specified amount
    void withdraw(double amount);

    // Declare the abstract method "getBalance" to retrieve the current balance
    double getBalance();
}
