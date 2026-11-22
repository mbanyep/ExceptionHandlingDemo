package bank;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        try {
            account.withdraw(600);
        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }

        account.displayBalance();

    }
}
