package Class;

public class EncapsulationExample {
    public static void main(String[] args) {
        // Creating an object of BankAccount
        BankAccount account = new BankAccount(5000);

        // Accessing balance using getter
        System.out.println("Initial Balance: " + account.getBalance());

        // Depositing money
        account.deposit(2000);
        System.out.println("Updated Balance: " + account.getBalance());

        // Withdrawing money
        account.withdraw(1500);
        System.out.println("Final Balance: " + account.getBalance());

        // Trying to access private variable directly (Uncommenting will cause an error)
        // account.balance = 10000; // ERROR: balance has private access in BankAccount
    }
}
