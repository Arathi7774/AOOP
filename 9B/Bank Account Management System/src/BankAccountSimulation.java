public class BankAccountSimulation {

    public static void main(String[] args) {
        // Create a shared BankAccount object with an initial balance
        BankAccount account = new BankAccount(1000);

        // Create multiple threads simulating users performing transactions
        Thread user1 = new Thread(new UserTransaction(account, 500, true), "User 1");  // Deposit 500
        Thread user2 = new Thread(new UserTransaction(account, 300, false), "User 2"); // Withdraw 300
        Thread user3 = new Thread(new UserTransaction(account, 200, false), "User 3"); // Withdraw 200
        Thread user4 = new Thread(new UserTransaction(account, 700, true), "User 4");  // Deposit 700
        Thread user5 = new Thread(new UserTransaction(account, 400, false), "User 5"); // Withdraw 400

        // Start all threads
        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();

        // Wait for all threads to finish
        try {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
            user5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final balance after all transactions
        System.out.println("Final balance: " + account.getBalance());
    }
}

// Define the UserTransaction class that implements Runnable for threading
class UserTransaction implements Runnable {
    private BankAccount account;
    private double amount;
    private boolean isDeposit;

    // Constructor to initialize transaction details
    public UserTransaction(BankAccount account, double amount, boolean isDeposit) {
        this.account = account;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    @Override
    public void run() {
        if (isDeposit) {
            account.deposit(amount);  // Perform deposit
        } else {
            account.withdraw(amount); // Perform withdrawal
        }
    }
}
