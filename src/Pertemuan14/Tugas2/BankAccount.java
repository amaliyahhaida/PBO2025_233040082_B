package Pertemuan14;

// Tugas 2
public class BankAccount {
    private final String accountNumber;  // Tidak bisa diubah setelah inisialisasi
    protected double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0; // default saldo
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public final void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance       : $" + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
