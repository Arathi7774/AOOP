public class BankAccount {
    private double balance;

    // Constructor to initialize the account with an initial balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Thread-safe deposit method
    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". Current balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to deposit a negative amount.");
        }
    }

    // Thread-safe withdraw method
    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". Current balance: " + balance);
        } else if (amount > balance) {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + ", but insufficient funds. Current balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw a negative amount.");
        }
    }

    // Thread-safe method to get the current balance
    public synchronized double getBalance() {
        return balance;
    }
}
