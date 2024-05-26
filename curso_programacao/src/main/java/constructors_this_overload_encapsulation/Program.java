package constructors_this_overload_encapsulation;

import constructors_this_overload_encapsulation.entities.BankAccount;

import java.util.Scanner;

public class Program {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        String isThereInitialDeposit = sc.next();

        BankAccount bankAccount;

        if(isThereInitialDeposit.equals("y")){
            System.out.print("Enter initial deposit: ");
            double initialDeposit = sc.nextDouble();

            bankAccount = new BankAccount(accountNumber, accountHolder, initialDeposit);
        } else {
            bankAccount = new BankAccount(accountNumber, accountHolder);
        }

        bankAccount.getAccountDetails();

        System.out.print("Enter a deposit value: ");
        bankAccount.deposit(sc.nextDouble());
        bankAccount.getAccountDetailsAfterUpdate();

        System.out.print("Enter a withdraw value: ");
        bankAccount.withdraw(sc.nextDouble());
        bankAccount.getAccountDetailsAfterUpdate();

        sc.close();
    }
}
