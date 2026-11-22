package bank;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawal successful: " + amount);
    }
    
}
