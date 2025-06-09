package Pertemuan14;

// Tugas 2
public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    // Error: Cannot override the final method from BankAccount
    // @Override
    // public void displayAccountInfo() {
    //     System.out.println("Savings Account Details:");
    //     super.displayAccountInfo();
    // }
}