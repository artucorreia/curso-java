package aplication;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = scan.nextInt();

        scan.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = scan.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char hasInitialDeposit = scan.next().charAt(0);

        Account account;
        if (hasInitialDeposit == 'y') {
            System.out.print("Enter initial deposit: ");
            double initialDeposit = scan.nextDouble();
            account = new Account(accountNumber, accountHolder, initialDeposit);
        } else {
            account = new Account(accountNumber, accountHolder);
        }

        System.out.println("\nAccount data:\n" + account);

        System.out.print("\nEnter a deposit value: ");
        account.deposit(scan.nextDouble());
        System.out.println("Update account data:\n" + account);

        System.out.print("\nEnter a withdraw value: ");
        account.withdraw(scan.nextDouble());
        System.out.println("Update account data:\n" + account);

        scan.close();
    }
}