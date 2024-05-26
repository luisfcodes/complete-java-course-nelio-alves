package constructors_this_overload_encapsulation.entities;

public class BankAccount {

    private final int accountNumber;
    private String cardholderName;
    private double balance;

    public BankAccount(int accountNumber, String cardholderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.cardholderName = cardholderName;
        this.balance = initialDeposit;
    }

    public BankAccount(int accountNumber, String cardholderName) {
        this.accountNumber = accountNumber;
        this.cardholderName = cardholderName;
    }

    public void setCardholderName(String cardholderName) {
       this.cardholderName = cardholderName;
       accountSummary();
    }

    public void getAccountDetails() {
        System.out.println("Account data:");
        accountSummary();
    }

    public void getAccountDetailsAfterUpdate() {
        System.out.println("Updated account data:");
        accountSummary();
    }

    private void accountSummary() {
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n", accountNumber, cardholderName, balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        double withdrawalFee = 5.00;
        balance -= (amount + withdrawalFee);
    }
}
